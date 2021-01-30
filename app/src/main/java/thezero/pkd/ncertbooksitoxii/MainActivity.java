package thezero.pkd.ncertbooksitoxii;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import thezero.pkd.ncertbooksitoxii.Adapter.FirebaseCustomAdapter;
import thezero.pkd.ncertbooksitoxii.MethodsHelper.GetterSetter;
import thezero.pkd.ncertbooksitoxii.MethodsHelper.HelperUtil;
import thezero.pkd.ncertbooksitoxii.MethodsHelper.SpacingItem;
import thezero.pkd.ncertbooksitoxii.Model.ChapterModel;
import thezero.pkd.ncertbooksitoxii.Model.CustomProgressUtilModel;
import thezero.pkd.ncertbooksitoxii.Model.OfflineModel;

public class MainActivity extends AppCompatActivity {
    private String file_name,mClassName,mSubjectName,mBookName;
    private final FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference collectionReference;
    private GetterSetter gs = new GetterSetter();
    ArrayAdapter <String> selectClassAdapter, selectSubAdapter, selectBookAdapter;
    private ArrayList <OfflineModel> mOfflineList;
    private ArrayList <CustomProgressUtilModel> mCustomProgressUtilList;
    private ArrayList<CustomProgressUtilModel> tempCustomList;
    private HelperUtil helperUtil = new HelperUtil();
    FirebaseCustomAdapter mCustomAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.my_tool_bar);
        setSupportActionBar(toolbar);
        tempCustomList=new ArrayList <>();
        mOfflineList=helperUtil.loadData(this);

        Spinner selectClass = findViewById(R.id.select_class);
        Spinner selectSubject = findViewById(R.id.select_subject);
        Spinner selectBook = findViewById(R.id.select_book);
        Button btnGet = findViewById(R.id.getButton);
        Button btnOfflineFile = findViewById(R.id.offline_download_file);

        selectClassAdapter = new ArrayAdapter <>(MainActivity.this, android.R.layout.simple_spinner_item, gs.classList);
        selectClassAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selectClass.setAdapter(selectClassAdapter);

        //Setting Spinner
        selectClass.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView <?> parent, View view, int position, long id) {
                gs.setClassNumber(position);
                selectSubAdapter = new ArrayAdapter <>(MainActivity.this, android.R.layout.simple_spinner_item, gs.getSubList());
                selectSubAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                selectSubject.setAdapter(selectSubAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView <?> parent) {
                Toast.makeText(getApplicationContext(), "Nothing Selected", Toast.LENGTH_SHORT).show();

            }
        });
        //Subject spinner setup
        selectSubject.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView <?> parent, View view, int position, long id) {
                gs.setSubjectName(gs.getSubList()[position].trim());
                selectBookAdapter = new ArrayAdapter <>(MainActivity.this, android.R.layout.simple_spinner_item, gs.getBookTitles());
                selectBookAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                selectBook.setAdapter(selectBookAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView <?> parent) {
                Toast.makeText(getApplicationContext(), "Nothing Selected", Toast.LENGTH_SHORT).show();

            }
        });
        //Book Spinner Setup
        selectBook.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView <?> parent, View view, int position, long id) {
                gs.setBookName(gs.getBookTitles()[position].trim());
            }

            @Override
            public void onNothingSelected(AdapterView <?> parent) {
                Toast.makeText(getApplicationContext(), "Nothing Selected", Toast.LENGTH_SHORT).show();
            }
        });
        //Get Button Setup
        btnGet.setOnClickListener(v -> {
            if (gs.getClassNumber() == 0) {
                Toast.makeText(getApplicationContext(), "Select Your Class", Toast.LENGTH_SHORT).show();
            } else if (gs.getSubjectName().equals("Select Subject")) {
                Toast.makeText(getApplicationContext(), "Select Your Subject", Toast.LENGTH_SHORT).show();
            } else if (gs.getBookName().equals("Select Book")) {
                Toast.makeText(getApplicationContext(), "Select Your Book", Toast.LENGTH_SHORT).show();
            } else if (gs.getClassNumber() != 0 && !gs.getSubjectName().equals("Select Subject") && !gs.getBookName().equals("Select Book")) {
                mBookName=gs.getBookName();
                mClassName=gs.getClassName();
                mSubjectName=gs.getSubjectName();
                LoadFireStoreData();
            }
        });
        //Offline Button Click setting
        btnOfflineFile.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, OfflineActivity.class);
            startActivity(intent);
        });
    }
//loading stored data
    private void LoadFireStoreData() {
        collectionReference = db.collection(gs.getClassName()).document(gs.getSubjectName())
                .collection(gs.getBookName());
        collectionReference.orderBy("name", Query.Direction.DESCENDING)
                .get()
                .addOnSuccessListener(new OnSuccessListener <QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        mCustomProgressUtilList = new ArrayList <>();
                        for (QueryDocumentSnapshot documentSnapshot : queryDocumentSnapshots) {
                            ChapterModel chapterModel = documentSnapshot.toObject(ChapterModel.class);
                            if (helperUtil.checkFileNameExist(mOfflineList, mClassName +mSubjectName+ mBookName + chapterModel.getName() + ".pdf")) {
                                mCustomProgressUtilList.add(new CustomProgressUtilModel(mClassName,mSubjectName,mBookName,100, chapterModel.getName(), chapterModel.getUrl(), "Downloaded"));
                            }
//                            else if (1){
//
//                            }
                            else {
                                mCustomProgressUtilList.add(new CustomProgressUtilModel(mClassName,mSubjectName,mBookName,0, chapterModel.getName(), chapterModel.getUrl(), "Not Downloaded"));
                            }
                        }
                        if (mCustomProgressUtilList != null) {
                            buildRecycler();
                        }
                    }
                });
    }
    private String downloadStat(int position,String classname,String subjectName,String bookName,int percentage){
        return null;
    }
    //Firebase recycler view setup
    private void buildRecycler() {
        RecyclerView recyclerView = findViewById(R.id.chapterRecycler);
        recyclerView.setHasFixedSize(true);
        mCustomAdapter = new FirebaseCustomAdapter(mCustomProgressUtilList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mCustomAdapter);
        recyclerView.addItemDecoration(new SpacingItem(10));

        mCustomAdapter.setOnItemClickListener(new FirebaseCustomAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                if(mCustomProgressUtilList.get(position).getStatus().equals("In Progress...")){
                    Toast.makeText(MainActivity.this,"Download in progress",Toast.LENGTH_SHORT).show();
                }else{
                    DownloadStatusTask downloadStatusTask = new DownloadStatusTask(mCustomProgressUtilList.get(position), position);
                    runTask(downloadStatusTask);
                }
            }
        });
    }
    public class DownloadStatusTask extends AsyncTask <Void, Integer, Boolean> {
        CustomProgressUtilModel customProgressUtilModel;
        int position;
        public DownloadStatusTask(CustomProgressUtilModel customProgressUtilModel, int position) {
            this.customProgressUtilModel = customProgressUtilModel;
            this.position = position;
        }
        @Override
        protected Boolean doInBackground(Void... voids) {
            return DownloadPdf();
        }
        private boolean DownloadPdf() {
            file_name=customProgressUtilModel.getClassName()+customProgressUtilModel.getSubjectName()+customProgressUtilModel.getBookName()+customProgressUtilModel.getName()+".pdf";
//            file_name = gs.getClassName() + gs.getBookName() + customProgressUtilModel.getName() + ".pdf";
            customProgressUtilModel.setStatus("In Progress...");
            Log.d("HI","Hillo 1");
            try {
                File file = getFileStreamPath(file_name);
                if (file.exists()) {
                    return true;
                }
                try {
                    FileOutputStream fileOutputStream = openFileOutput(file_name, Context.MODE_PRIVATE);

                    URL url = new URL(customProgressUtilModel.getUrl());
                    URLConnection conn = url.openConnection();
                    int contentLength = conn.getContentLength();
                    InputStream input = new BufferedInputStream(url.openStream());
                    byte data[] = new byte[contentLength];
                    long total = 0;
                    int count;
                    while ((count = input.read(data)) != -1) {
                        total += count;
                        publishProgress((int) ((total * 100) / contentLength));
                        fileOutputStream.write(data, 0, count);
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return true;
                } catch (Exception e) {
                    Log.d("HI","Hillo 3");
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
                Log.d("HI","Hillo 2");
                return false;
            }
        }
        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
            if (aBoolean) {
                if (helperUtil.checkFileNameExist(mOfflineList, file_name)) {
                    helperUtil.openPdf(MainActivity.this, file_name);
                } else {
                    insertItemToOfflineModel(customProgressUtilModel.getClassName(), customProgressUtilModel.getBookName(), file_name, customProgressUtilModel.getName());
                    helperUtil.saveData(MainActivity.this,mOfflineList);
                }
                customProgressUtilModel.setStatus("Download Complete");
                customProgressUtilModel.setPercentage(100);
//            mCustomAdapter.OnChangeItem(position);
                mCustomAdapter.OnChangeItem(customProgressUtilModel.getClassName(),customProgressUtilModel.getSubjectName(),customProgressUtilModel.getBookName(),position);
            } else {
                Toast.makeText(MainActivity.this, "Unable to download",
                        Toast.LENGTH_SHORT).show();
            }
        }
        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            customProgressUtilModel.setPercentage(values[0]);
            mCustomAdapter.OnChangeItem(customProgressUtilModel.getClassName(),customProgressUtilModel.getSubjectName(),customProgressUtilModel.getBookName(),position);
        }
    }
    public void runTask(DownloadStatusTask downloadStatusTask) {
        try {
            downloadStatusTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void insertItemToOfflineModel(String class_name, String book_name, String fileName, String chapterName) {
        mOfflineList.add(new OfflineModel(class_name, book_name, fileName, chapterName));
    }
}
package thezero.pkd.ncertbooksitoxii;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.reflect.TypeToken;

import thezero.pkd.ncertbooksitoxii.Adapter.OfflineRecyclerAdapter;
import thezero.pkd.ncertbooksitoxii.MethodsHelper.HelperUtil;
import thezero.pkd.ncertbooksitoxii.Model.OfflineModel;

public class OfflineActivity extends AppCompatActivity {
    private ArrayList <OfflineModel> mOfflineList;
    HelperUtil helperUtil=new HelperUtil();
    OfflineRecyclerAdapter mOfflineRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline);
        mOfflineList=helperUtil.loadData(this);
        if (mOfflineList.size() != 0) {
            buildRecyclerView();
        } else {
            Toast.makeText(getApplicationContext(), "Nothing Available", Toast.LENGTH_SHORT).show();
        }
    }
    private void buildRecyclerView() {
        RecyclerView mRecyclerView = findViewById(R.id.offline_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mOfflineRecyclerAdapter = new OfflineRecyclerAdapter(mOfflineList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mOfflineRecyclerAdapter);
        mOfflineRecyclerAdapter.setOnItemClickListener(new OfflineRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                helperUtil.openPdf(OfflineActivity.this,mOfflineList.get(position).getFileName());
            }
            @Override
            public void onItemDelete(int position) {
                removeItem(position);
            }
        });
    }
    private void removeItem(int position){
        if(removeFile(mOfflineList.get(position).getFileName())){
            mOfflineList.remove(position);
            helperUtil.saveData( this,mOfflineList);
            mOfflineRecyclerAdapter.notifyItemRemoved(position);
        }
    }
    private boolean removeFile(String file_name){
            if(checkFIlePath(file_name)){
                if (fileDelete(file_name)){
                    Toast.makeText(OfflineActivity.this,"Successful",Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }else {
                Toast.makeText(OfflineActivity.this,"File Not Exist NotExist",Toast.LENGTH_SHORT).show();
                return true;
            }
    }
    private boolean checkFIlePath(String filename){
        try {
            File file=getFileStreamPath(filename);
            return file.exists();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    private boolean fileDelete(String filename){
        try {
            File file=getFileStreamPath(filename);
            return file.delete();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
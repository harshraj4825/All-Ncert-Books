package thezero.pkd.ncertbooksitoxii.MethodsHelper;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import thezero.pkd.ncertbooksitoxii.Model.OfflineModel;
import thezero.pkd.ncertbooksitoxii.ViewPdfOnline;

public class HelperUtil {
    public boolean checkFileNameExist(ArrayList<OfflineModel> mOfflineList,String file_name){
        for(int i=0;i<mOfflineList.size();i++){
            OfflineModel currentItem = mOfflineList.get(i);
            if(currentItem.getFileName().equals(file_name)){
                return true;
            }
        }
        return false;
    }
    public void openPdf(Context context,String pdffile) {
        try {
            Intent intent = new Intent(context, ViewPdfOnline.class);
            intent.putExtra("ChapterName", pdffile);
            context.startActivity(intent);
        } catch (Exception ignored) {
        }
    }
    //loading data from internal storage
    public ArrayList<OfflineModel> loadData(Context context){
        ArrayList<OfflineModel> mOfflineList;
        SharedPreferences sharedPreferences=context.getSharedPreferences("shared preferences", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sharedPreferences.getString("file_name", null);
        Type type = new TypeToken <ArrayList <OfflineModel>>() {
        }.getType();
        mOfflineList = gson.fromJson(json, type);
        if (mOfflineList == null) {
            mOfflineList = new ArrayList <>();
        }
        return mOfflineList;
    }
    //save data/update to internal storage
    public void saveData(Context context,ArrayList<OfflineModel> mOfflineList) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("shared preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(mOfflineList);
        editor.putString("file_name", json);
        editor.apply();
    }
}

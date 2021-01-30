package thezero.pkd.ncertbooksitoxii.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import thezero.pkd.ncertbooksitoxii.Model.CustomProgressUtilModel;
import thezero.pkd.ncertbooksitoxii.R;

public class FirebaseCustomAdapter extends RecyclerView.Adapter <FirebaseCustomAdapter.FirebaseCustomViewHolder> {
    private ArrayList <CustomProgressUtilModel> mCustomProgressUtilModels;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public FirebaseCustomAdapter(ArrayList <CustomProgressUtilModel> mCustomProgressUtilModels) {
        this.mCustomProgressUtilModels = mCustomProgressUtilModels;
    }

    @NonNull
    @Override
    public FirebaseCustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_chapter_row, parent, false);
        return new FirebaseCustomViewHolder(v, mListener);
    }
    @Override
    public void onBindViewHolder(@NonNull FirebaseCustomViewHolder holder, int position) {
        CustomProgressUtilModel temp = mCustomProgressUtilModels.get(position);
        holder.tvChaperName.setText(temp.getName());
        holder.tvStatus.setText(temp.getStatus());
        holder.tvProgressPercentage.setText(temp.getPercentage() + "%");
        holder.progressBar.setProgress(temp.getPercentage());
    }

    @Override
    public int getItemCount() {
        return mCustomProgressUtilModels.size();
    }

    public class FirebaseCustomViewHolder extends RecyclerView.ViewHolder {
        TextView tvChaperName, tvProgressPercentage, tvStatus;
        ProgressBar progressBar;

        public FirebaseCustomViewHolder(@NonNull View itemView, OnItemClickListener listener) {
            super(itemView);
            tvChaperName = itemView.findViewById(R.id.chapter_name);
            tvProgressPercentage = itemView.findViewById(R.id.progressPercentage);
            tvStatus = itemView.findViewById(R.id.progressStatus);
            progressBar = itemView.findViewById(R.id.progressbar);
            itemView.setOnClickListener(v -> {
                if (listener != null) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        listener.onItemClick(position);
                    }
                }
            });
        }
    }

    public void OnChangeItem(String className,String subjectName,String bookName,int position) {
        for(CustomProgressUtilModel customProgressUtilModel:mCustomProgressUtilModels){
            if(customProgressUtilModel.getClassName().equals(className)&&customProgressUtilModel.getSubjectName().equals(subjectName)&&customProgressUtilModel.getBookName().equals(bookName)){
                notifyItemChanged(position);
            }
        }
    }
}

package thezero.pkd.ncertbooksitoxii.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

import thezero.pkd.ncertbooksitoxii.Model.OfflineModel;
import thezero.pkd.ncertbooksitoxii.R;

public class OfflineRecyclerAdapter extends RecyclerView.Adapter <OfflineRecyclerAdapter.OfflineRecyclerViewHolder> {
    private ArrayList <OfflineModel> mOfflineList;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
        void onItemDelete(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public OfflineRecyclerAdapter(ArrayList <OfflineModel> mOfflineList) {
        this.mOfflineList = mOfflineList;
    }

    @NonNull
    @Override
    public OfflineRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_offline_row, parent, false);
        return new OfflineRecyclerViewHolder(v, mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull OfflineRecyclerViewHolder holder, int position) {
        OfflineModel currentItem = mOfflineList.get(position);
        holder.mClassname.setText(currentItem.getClass_name());
        holder.mBookName.setText(currentItem.getBook_name());
        holder.mChapterName.setText(currentItem.getChapterName());
    }
    @Override
    public int getItemCount() {
        return mOfflineList.size();
    }

    public class OfflineRecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView mClassname, mBookName, mChapterName;
        public Button mDelete;

        public OfflineRecyclerViewHolder(@NonNull View itemView, OnItemClickListener listener) {
            super(itemView);
            mClassname = itemView.findViewById(R.id.offline_class_name);
            mBookName = itemView.findViewById(R.id.offline_book_name);
            mChapterName = itemView.findViewById(R.id.offline_chapterName);
            mDelete = itemView.findViewById(R.id.offlineDelete);
            itemView.setOnClickListener(v -> {
                if (listener != null) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        listener.onItemClick(position);
                    }
                }
            });
            mDelete.setOnClickListener(v -> {
                if (listener != null) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        listener.onItemDelete(position);
                    }
                }
            });
        }
    }
}

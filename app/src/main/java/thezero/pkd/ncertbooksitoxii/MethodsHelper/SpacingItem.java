package thezero.pkd.ncertbooksitoxii.MethodsHelper;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SpacingItem extends RecyclerView.ItemDecoration {
    int space;

    public SpacingItem(int space) {
        this.space = space;
    }
    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.left=space;
        outRect.right=space;
        if(parent.getChildLayoutPosition(view)==0){
            outRect.top=space;
        }
        outRect.bottom=space;
    }
}

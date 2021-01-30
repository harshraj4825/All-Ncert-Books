package thezero.pkd.ncertbooksitoxii;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

import java.io.File;

public class ViewPdfOnline extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pdf_online);
        String fileName = getIntent().getStringExtra("ChapterName");
        File file = getFileStreamPath(fileName);
        pdfView = findViewById(R.id.pdfView);
        pdfView.fromFile(file)
                .defaultPage(0)
                .enableSwipe(true)
                .enableDoubletap(true)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(2)
                .load();
    }


//
//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//    }
}
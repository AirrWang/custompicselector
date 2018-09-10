package com.example.airr.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.pictureselect.PictureUtil;
import com.luck.picture.lib.PictureSelector;
import com.luck.picture.lib.config.PictureMimeType;

import static com.example.pictureselect.PictureUtil.Type.GALLERY;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PictureUtil.creatOpenGallery(MainActivity.this, PictureMimeType.ofAll(),GALLERY).setThemeStyle(R.style.picture_QQ_style).forResult(1);
            }
        });
    }

}

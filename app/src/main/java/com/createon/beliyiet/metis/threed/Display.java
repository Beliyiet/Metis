package com.createon.beliyiet.metis.threed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.createon.beliyiet.metis.R;
import com.shizhefei.view.largeimage.LargeImageView;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        setDisplay();
    }

    private void setDisplay() {
        LargeImageView imageView = (LargeImageView)findViewById(R.id.imageView);
        imageView.setImage(R.drawable.east_xujing);

        imageView.setEnabled(true);
    }
}

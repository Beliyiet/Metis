package com.createon.beliyiet.metis.threed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

import com.createon.beliyiet.metis.R;

import me.panpf.sketch.SketchImageView;


public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        draw();
    }

    private void draw() {

        Intent intent = getIntent();
        String station = intent.getStringExtra("stationout");

        SketchImageView sketchImageView = (SketchImageView)findViewById(R.id.sketchImage);
        sketchImageView.displayAssetImage(station);
        sketchImageView.setZoomEnabled(true);

    }

}

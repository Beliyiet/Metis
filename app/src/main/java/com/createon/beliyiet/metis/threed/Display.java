package com.createon.beliyiet.metis.threed;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.createon.beliyiet.metis.R;

import me.panpf.sketch.SketchImageView;


public class Display extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        draw();
    }

    private void draw() {

        SketchImageView sketchImageView = (SketchImageView)findViewById(R.id.sketchImage);
        sketchImageView.displayResourceImage(R.drawable.image_overview);

    }

}

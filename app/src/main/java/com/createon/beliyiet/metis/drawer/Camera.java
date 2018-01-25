package com.createon.beliyiet.metis.drawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import com.createon.beliyiet.metis.R;

public class Camera extends AppCompatActivity {

    SurfaceView surfaceView0;
    SurfaceHolder surfaceHolder0;
    Camera camera0;
    int viewWidth;
    int viewHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

    }
}

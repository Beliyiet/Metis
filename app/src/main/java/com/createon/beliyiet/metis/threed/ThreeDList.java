package com.createon.beliyiet.metis.threed;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

import com.createon.beliyiet.metis.R;

public class ThreeDList extends AppCompatActivity {

    private ImageView imageView0;
    private ImageView imageView1;
    private ImageView splash_0;
    private CardView cardView0;
    private CardView cardView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_dlist);

        imageView0 = (ImageView)findViewById(R.id.threed_image0);
        imageView0.setImageResource(R.drawable.image_fps);
        imageView0.setScaleType(ImageView.ScaleType.CENTER_CROP);

        imageView1 = (ImageView)findViewById(R.id.threed_image1);
        imageView1.setImageResource(R.drawable.image_overview);
        imageView1.setScaleType(ImageView.ScaleType.CENTER_CROP);

        cardView0 = (CardView)findViewById(R.id.threed_fpsview);
        cardView1 = (CardView)findViewById(R.id.threed_overview);
        splash_0 = (ImageView)findViewById(R.id.threed_splash);
        splash_0.setScaleType(ImageView.ScaleType.FIT_XY);



        onDataClick1();
    }

    private void onDataClick1() {

        cardView0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                splash_0.setImageResource(R.drawable.metis_fpsview);
                Handler handler_0 = new Handler();
                handler_0.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent();
                        intent.setClassName("com.createon.metis.fpsview","com.unity3d.player.UnityPlayerActivity");
                        startActivity(intent);
                    }
                },3000);    
            }
        });

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                splash_0.setImageResource(R.drawable.metis_overview);
                Handler handler_1 = new Handler();
                handler_1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent();
                        intent.setClassName("com.createon.metis.overview","com.unity3d.player.UnityPlayerActivity");
                        startActivity(intent);
                    }
                },3000);

            }
        });

    }
}

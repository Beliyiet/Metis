package com.createon.beliyiet.metis.navi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.createon.beliyiet.metis.R;

public class JumpToGMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump_to_gmap);

        Intent intent=new Intent();
        //包名 包名+类名（全路径）
        intent.setClassName("com.autonavi.amapauto", "com.autonavi.auto.remote.fill.UsbFillActivity");
        startActivity(intent);
    }
}

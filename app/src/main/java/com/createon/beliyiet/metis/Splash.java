package com.createon.beliyiet.metis;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // 用Handler的postDelayed方法，3秒后执行跳转到MainActivity
        new Handler().postDelayed(new Runnable() {
            public void run() {
                goHome();
            }
        }, 3000);
    }
    private void goHome() {
        Intent intent = new Intent(Splash.this, Main.class);
        Splash.this.startActivity(intent);
        Splash.this.finish();

    }

}

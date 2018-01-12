package com.createon.beliyiet.metis;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.createon.beliyiet.metis.data.Data;
import com.createon.beliyiet.metis.data.DataList;
import com.createon.beliyiet.metis.navi.JumpToGMap;
import com.createon.beliyiet.metis.navi.Navi;

import com.createon.beliyiet.metis.programming.Programming;
import com.createon.beliyiet.metis.study.Study;
import com.createon.beliyiet.metis.test.Test;

public class Main extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    private GridView gridView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Metis");

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //路线导航//
        CardView cardView1 = (CardView)findViewById(R.id.main_cardview1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this,JumpToGMap.class);
                startActivity(intent);
            }
        });
        //3D模型//
        CardView cardView2 = (CardView)findViewById(R.id.main_cardview2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                //包名 包名+类名（全路径）
                intent.setClassName("com.createon.station", "com.unity3d.player.UnityPlayerActivity");
                startActivity(intent);
            }
        });
        //实战资料速查//
        CardView cardView3 = (CardView)findViewById(R.id.main_cardview3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this,DataList.class);
                startActivity(intent);
            }
        });
        //作战编程//
        CardView cardView4 = (CardView)findViewById(R.id.main_cardview4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this,Programming.class);
                startActivity(intent);
            }
        });
        //案例学习//
        CardView cardView5 = (CardView)findViewById(R.id.main_cardview5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this,Study.class);
                startActivity(intent);
            }
        });
        //考试系统//
        CardView cardView6 = (CardView)findViewById(R.id.main_cardview6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this,Test.class);
                startActivity(intent);
            }
        });

        ImageView imageView1 = (ImageView)findViewById(R.id.img1);
        ImageView imageView2 = (ImageView)findViewById(R.id.img2);
        ImageView imageView3 = (ImageView)findViewById(R.id.img3);
        ImageView imageView4 = (ImageView)findViewById(R.id.img4);
        ImageView imageView5 = (ImageView)findViewById(R.id.img5);
        ImageView imageView6 = (ImageView)findViewById(R.id.img6);
        imageView1.setImageResource(R.drawable.image_navi);
        imageView1.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView2.setImageResource(R.drawable.image_3dstation);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView3.setImageResource(R.drawable.image_data);
        imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView4.setImageResource(R.drawable.image_programme);
        imageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView5.setImageResource(R.drawable.image_learing);
        imageView5.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView6.setImageResource(R.drawable.image_test);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_CROP);



/*
        GridView gridView1 = (GridView)findViewById(R.id.gridview1);
        dataList = new ArrayList<Map<String, Object>>();
        simpleAdapter1 = new SimpleAdapter(
                this,getData(),
                R.layout.item,new String[]{"image","names"},
                new int[]{R.id.main_card_img1,
                        R.id.main_card_text1});
        gridView1.setAdapter(simpleAdapter1);
*/
    }
/*
    private List<Map<String,Object>> getData() {
        for(int i=0;i<image.length;i++){
            Map<String, Object> map= new HashMap<String, Object>();
            map.put("image", image[i]);
            map.put("names", names[i]);
            dataList.add(map);
        }
        return dataList;
    }
*/
////////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_note) {
            // Handle the camera action
        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_settings) {

        } else if (id == R.id.nav_feedback) {

        } else if (id == R.id.nav_about) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private boolean mIsExit;
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (mIsExit) {
                this.finish();
            } else {
                Toast.makeText(this, "再按一次退出", Toast.LENGTH_SHORT).show();
                mIsExit = true;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mIsExit = false;
                    }
                }, 2000);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}

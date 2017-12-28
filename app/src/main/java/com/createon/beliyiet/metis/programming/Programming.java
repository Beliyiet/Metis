package com.createon.beliyiet.metis.programming;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.createon.beliyiet.metis.R;

public class Programming extends AppCompatActivity {

    String url1  ="Subway_explosion_terrorist_attack_battle_programming.pdf";
    String url2  ="Subway_nuclear_biochemical_accident_fighting_programming.pdf";
    String url3  ="Elevated_interval_train_fire_fighting_programming.pdf";
    String url4  ="Elevated_platform_fire_fighting_programming.pdf";
    String url5  ="Train_rear_end_accident_fighting_programming.pdf";
    String url6  ="Interval_tunnel_train_fire_fighting_programming.pdf";
    String url7  ="Stop_train_(underground_station)_fire_fighting_programming.pdf";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final ListView listView2 = (ListView)findViewById(R.id.programming_list);
        final String[] arr2 = {"地铁爆炸类恐怖袭击战斗编程","地铁核生化事故战斗编程","高架区间列车火灾战斗编程","高架站台（停站列车）火灾战斗编程","列车追尾事故战斗编程","区间隧道列车火灾扑救战斗编程","停站列车（地下站台）火灾扑救战斗编程"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,R.layout.array_item,arr2);
        listView2.setAdapter(adapter1);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Programming.this,ProgrammingContent.class);
                switch (position){
                    case 0:
                        intent.putExtra("urlout1",url1);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("urlout1",url2);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("urlout1",url3);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("urlout1",url4);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("urlout1",url5);
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("urlout1",url6);
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("urlout1",url7);
                        startActivity(intent);
                        break;
                }
            }
        });

    }

}

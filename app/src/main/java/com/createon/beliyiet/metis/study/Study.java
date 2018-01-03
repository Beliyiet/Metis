package com.createon.beliyiet.metis.study;

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
import com.createon.beliyiet.metis.programming.Programming;
import com.createon.beliyiet.metis.programming.ProgrammingContent;

public class Study extends AppCompatActivity {

    String url3_1  ="01xujiahui.pdf";
    String url3_2  ="02austria.pdf";
    String url3_3  ="03france.pdf";
    String url3_4  ="04huangpinan.pdf";
    String url3_5  ="05ten.pdf";
    String url3_6  ="06caoyanglu.pdf";
    String url3_7  ="07jinqiao.pdf";
    String url3_8  ="08korea.pdf";
    String url3_9  ="09japan.pdf";
    String url3_10 ="10swiss.pdf";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);
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

        final ListView listView3 = (ListView)findViewById(R.id.study_list);
        final String[] arr3 = {"11号线徐家汇站在建工地空压机冒烟事故","奥地利陶恩隧道火灾","法国勃朗峰隧道火灾","轨道交通1号线黄陂南路站站台层变配电室火灾","轨道交通10号线列车追尾碰撞事故","轨道交通11号线曹杨路站在建地铁盾构机火灾","轨道交通12号线金桥停车场在建工地坍塌事故","韩国大邱地铁火灾","日本津靖海峡隧道火灾","瑞士圣哥塔隧道"};

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,R.layout.array_item,arr3);
        listView3.setAdapter(adapter3);

        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Study.this,StudyContent.class);
                switch (position){
                    case 0:
                        intent.putExtra("urlout3",url3_1);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("urlout3",url3_2);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("urlout3",url3_3);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("urlout3",url3_4);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("urlout3",url3_5);
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("urlout3",url3_6);
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("urlout3",url3_7);
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("urlout3",url3_8);
                        startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("urlout3",url3_9);
                        startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("urlout3",url3_10);
                        startActivity(intent);
                        break;
                }
            }
        });
    }

}

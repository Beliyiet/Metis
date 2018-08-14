package com.createon.beliyiet.metis.data.lines;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.createon.beliyiet.metis.R;
import com.createon.beliyiet.metis.data.DataContent;

public class Line13 extends AppCompatActivity {

    String l13s1 = "13_daduhe_road.pdf";
    String l13s2 = "13_fengzhuang.pdf";
    String l13s3 = "13_south_qilianshan_road.pdf";
    String l13s4 = "2-12-13_west_nanjing_road.pdf";
    String l13s5 = "13_zhenbei_road.pdf";
    String l13s6 = "3_4_13_jinshajiang_road";
    String l13s7 = "13_west_jinshajiang.pdf";
    String l13s8 = "13_jinyun.pdf";
    String l13s9 = "13_wuning.pdf";
    String l13s10 = "7_13_changshou_road.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line13);

        final ListView listView13 = (ListView)findViewById(R.id.list_line13);
        final String[] line13 = {
                "大渡河路站",
                "丰庄路站",
                "祁连山南路站",
                "南京西路站",
                "真北路站",
                "金沙江路站",
                "金沙江西路站",
                "金运路站",
                "武宁路站",
                "长寿路站",
        };

        ArrayAdapter list_13 =new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,line13);
        listView13.setAdapter(list_13);

        listView13.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Line13.this,DataContent.class);
                switch (position){
                    case 0:
                        intent.putExtra("urlout",l13s1);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("urlout",l13s2);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("urlout",l13s3);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("urlout",l13s4);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("urlout",l13s5);
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("urlout",l13s6);
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("urlout",l13s7);
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("urlout",l13s8);
                        startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("urlout",l13s9);
                        startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("urlout",l13s10);
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}

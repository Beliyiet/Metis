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

public class Line4 extends AppCompatActivity {

    String l4s1 = "2-4-6-9_century_avenue.pdf";
    String l4s2 = "3-4_west_yanan.pdf";
    String l4s3 = "3-4_zhenping_road.pdf";
    String l4s4 = "3_4_10_hongqiao_road.pdf";
    String l4s5 = "3_4_13_jinshajiang_road";
    String l4s6 = "2_zhongshan_park.pdf";
    String l4s7 = "3_zhongtan_road.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line4);

        final ListView listView4 = (ListView)findViewById(R.id.list_line4);
        final String[] arr4 = {
                "世纪大道站",
                "延安西路站",
                "镇坪路站",
                "虹桥路站",
                "金沙江路站",
                "中山公园站",
                "中潭路站",

        };

        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,arr4);
        listView4.setAdapter(adapter4);

        listView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Line4.this,DataContent.class);
                switch (position){
                    case 0:
                        intent.putExtra("urlout",l4s1);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("urlout",l4s2);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("urlout",l4s3);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("urlout",l4s4);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("urlout",l4s5);
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("urlout",l4s6);
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("urlout",l4s7);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}

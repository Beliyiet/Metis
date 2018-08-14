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

public class Line3 extends AppCompatActivity {

    String l3s1 = "3_zhongtan_road.pdf";
    String l3s2 = "3-4_west_yanan.pdf";
    String l3s3 = "3-4_zhenping_road.pdf";
    String l3s4 = "3_4_10_hongqiao_road.pdf";
    String l3s5 = "3_4_13_jinshajiang_road";
    String l3s6 = "2_3_4_zhongshan_park.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line3);

        final ListView listView = (ListView)findViewById(R.id.list_line3);
        final String[] line3 = {
                "中潭路站",
                "延安西路站",
                "镇坪路站",
                "虹桥路站",
                "金沙江路站",
                "中山公园站"
        };

        ArrayAdapter list_3 =new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,line3);
        listView.setAdapter(list_3);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Line3.this,DataContent.class);
                switch (position){
                    case 0:
                        intent.putExtra("urlout",l3s1);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("urlout",l3s2);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("urlout",l3s3);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("urlout",l3s4);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("urlout",l3s5);
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("urlout",l3s6);
                        startActivity(intent);
                        break;

                }
            }
        });
    }
}

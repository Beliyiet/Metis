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

public class Line2 extends AppCompatActivity {

    String l2s1 = "2_east_xujing.pdf";
    String l2s2 = "2_hongqiao_airport_terminal_1.pdf";
    String l2s3 = "2_songhong_road.pdf";
    String l2s4 = "2_beixinjing.pdf";
    String l2s5 = "2_loushanguan_road.pdf";
    String l2s6 = "2_west_nanjing_road.pdf";
    String l2s7 = "2_changshou_road.pdf";
    String l2s8 = "2-4-6-9_century_avenue.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line2);

        final ListView listView = (ListView)findViewById(R.id.list_line2);
        final String[] line2 = {
                "徐泾东站",
                "虹桥2号航站楼站",
                "淞虹路站",
                "北新泾站",
                "娄山关路站",
                "南京西路站",
                "长寿路站",
                "世纪大道站"

        };

        ArrayAdapter list_2 =new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,line2);
        listView.setAdapter(list_2);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Line2.this,DataContent.class);
                switch (position){
                    case 0:
                        intent.putExtra("urlout",l2s1);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("urlout",l2s2);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("urlout",l2s3);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("urlout",l2s4);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("urlout",l2s5);
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("urlout",l2s6);
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("urlout",l2s7);
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("urlout",l2s8);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}

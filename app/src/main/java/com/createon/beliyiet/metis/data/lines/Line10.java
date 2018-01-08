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

public class Line10 extends AppCompatActivity {

    String l10s1 = "10_longxi_road.pdf";
    String l10s2 = "10_shanghai_zoo.pdf";
    String l10s3 = "10_shuicheng_road.pdf";
    String l10s4 = "10_songyuan_road.pdf";
    String l10s5 = "10_yili_road.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line10);

        final ListView listView10 = (ListView)findViewById(R.id.list_line10);
        final String[] line10 = {
                "龙溪路站",
                "上海动物园站",
                "水城路站",
                "宋园路站",
                "伊犁路站"
        };

        ArrayAdapter list_10 =new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,line10);
        listView10.setAdapter(list_10);

        listView10.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Line10.this,DataContent.class);
                switch (position){
                    case 0:
                        intent.putExtra("urlout",l10s1);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("urlout",l10s2);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("urlout",l10s3);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("urlout",l10s4);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("urlout",l10s5);
                        startActivity(intent);
                        break;
                }
            }
        });


    }
}

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

public class Line9 extends AppCompatActivity {

    String l9s1 = "2-4-6-9_century_avenue.pdf";
    String l9s2 = "9_caohejing_hi_tech_park.pdf";
    String l9s3 = "9_guilin_road.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line9);

        final ListView listView = (ListView)findViewById(R.id.list_line9);
        final String[] line9 = {
                "世纪大道站",
                "漕河泾开发区站",
                "桂林路站"
        };

        ArrayAdapter list_9 = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,line9);
        listView.setAdapter(list_9);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Line9.this,DataContent.class);
                switch (position){
                    case 0:
                        intent.putExtra("urlout",l9s1);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("urlout",l9s2);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("urlout",l9s3);
                        startActivity(intent);
                        break;
                }

            }
        });

    }
}

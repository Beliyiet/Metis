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

public class Line12 extends AppCompatActivity {

    String l12s1 = "2-12-13_west_nanjing_road.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line12);
        final ListView listView = (ListView)findViewById(R.id.list_line12);
        final String[] line12 = {
                "南京西路站",
        };
        ArrayAdapter list_12 =new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,line12);
        listView.setAdapter(list_12);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Line12.this,DataContent.class);
                switch (position){
                    case 0:
                        intent.putExtra("urlout",l12s1);
                        startActivity(intent);
                        break;
                }
            }
        });


    }
}

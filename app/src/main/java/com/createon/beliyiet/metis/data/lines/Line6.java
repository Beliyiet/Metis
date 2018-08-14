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

public class Line6 extends AppCompatActivity {

    String l6s1 = "2-4-6-9_century_avenue.pdf";
    String l6s2 = "6_8_11_dtzx.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line6);

        final ListView listView = (ListView)findViewById(R.id.list_line6);
        final String[] line6 = {
                "世纪大道站",
                "东方体育中心站"
        };

        ArrayAdapter list_6 = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,line6);
        listView.setAdapter(list_6);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Line6.this,DataContent.class);
                switch (position){
                    case 0 :
                        intent.putExtra("urlout",l6s1);
                        startActivity(intent);
                        break;
                    case 1 :
                        intent.putExtra("urlout",l6s2);
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}

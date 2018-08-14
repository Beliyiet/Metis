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

public class Line7 extends AppCompatActivity {

    String l7s1 = "7_changping_road.pdf";
    String l7s2 = "2_longyang_road.pdf";
    String l7s3 = "7_xincun_road.pdf";
    String l7s4 = "7_13_changshou_road.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line7);

        final ListView listView = (ListView)findViewById(R.id.list_line7);
        final String[] line6 = {
                "昌平路站",
                "龙阳路站",
                "新村路站",
                "长寿路站"
        };

        ArrayAdapter list_6 = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,line6);
        listView.setAdapter(list_6);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Line7.this,DataContent.class);
                switch (position){
                    case 0 :
                        intent.putExtra("urlout",l7s1);
                        startActivity(intent);
                        break;
                    case 1 :
                        intent.putExtra("urlout",l7s2);
                        startActivity(intent);
                        break;
                    case 2 :
                        intent.putExtra("urlout",l7s3);
                        startActivity(intent);
                        break;
                    case 3 :
                        intent.putExtra("urlout",l7s4);
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}

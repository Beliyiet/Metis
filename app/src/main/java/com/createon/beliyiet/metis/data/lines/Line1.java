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

public class Line1 extends AppCompatActivity {

    String l1s1 = "1_people_square.pdf";
    String l1s2 = "1_xujiahui.pdf";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line2);

        final ListView listView = (ListView)findViewById(R.id.list_line2);
        final String[] line2 = {
                "人民广场站",
                "徐家汇站"
        };

        ArrayAdapter list_2 =new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,line2);
        listView.setAdapter(list_2);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Line1.this,DataContent.class);
                switch (position){
                    case 0:
                        intent.putExtra("urlout",l1s1);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("urlout",l1s2);
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}

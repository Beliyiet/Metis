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

public class Line11 extends AppCompatActivity {

    String l11s1 = "11_disney_resort.pdf";
    String l11s2 = "11_kangxing_highway.pdf";
    String l11s3 = "11_xiuyan_road.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line11);

        final ListView listView11 = (ListView)findViewById(R.id.list_line11);
        final String[] line11 = {
                "迪士尼站",
                "康兴公路站",
                "秀园路站",
        };

        ArrayAdapter list_11 =new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,line11);
        listView11.setAdapter(list_11);

        listView11.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Line11.this,DataContent.class);
                switch (position){
                    case 0:
                        intent.putExtra("urlout",l11s1);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("urlout",l11s2);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("urlout",l11s3);
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}

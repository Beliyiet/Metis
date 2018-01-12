package com.createon.beliyiet.metis.data;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.createon.beliyiet.metis.R;
import com.createon.beliyiet.metis.data.lines.Line10;
import com.createon.beliyiet.metis.data.lines.Line11;
import com.createon.beliyiet.metis.data.lines.Line12;
import com.createon.beliyiet.metis.data.lines.Line13;
import com.createon.beliyiet.metis.data.lines.Line2;
import com.createon.beliyiet.metis.data.lines.Line3;
import com.createon.beliyiet.metis.data.lines.Line4;
import com.createon.beliyiet.metis.data.lines.Line6;
import com.createon.beliyiet.metis.data.lines.Line9;

public class DataList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final ListView listView2 = (ListView)findViewById(R.id.list_lines);
        final String[] lines = {
                "一号线",
                "二号线",
                "三号线",
                "四号线",
                "五号线",
                "六号线",
                "七号线",
                "八号线",
                "九号线",
                "十号线",
                "十一号线",
                "十二号线",
                "十三号线",
                "十四号线",
                "十五号线",
                "十六号线",
                "十七号线",
                "十八号线",
                "磁浮线",
        };

        ArrayAdapter<String> lineAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,lines);
        listView2.setAdapter(lineAdapter);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:

                        break;
                    case 1:
                        Intent intent1 = new Intent(DataList.this,Line2.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(DataList.this,Line3.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(DataList.this,Line4.class);
                        startActivity(intent3);
                        break;
                    case 4:

                        break;
                    case 5:
                        Intent intent5 = new Intent(DataList.this,Line6.class);
                        startActivity(intent5);
                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:
                        Intent intent8 = new Intent(DataList.this,Line9.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(DataList.this,Line10.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(DataList.this,Line11.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(DataList.this,Line12.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(DataList.this,Line13.class);
                        startActivity(intent12);
                        break;
                    case 13:

                        break;
                    case 14:

                        break;
                    case 15:

                        break;
                    case 16:

                        break;
                    case 17:

                        break;
                    case 18:

                        break;
                }
            }
        });
    }

}

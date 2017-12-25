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

public class Data extends AppCompatActivity {

    String url1 = "zhongshangongyuan.pdf";
    String url2 = "beixinjing.pdf";
    String url3 = "loushanguanlu.pdf";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
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

        final ListView listView1 = (ListView)findViewById(R.id.data_list);
        final String[] arr1 = {"中山公园站","北新泾站","娄山关路站","淞虹路站","徐泾东站","镇坪路站","中潭路站","长寿路站","龙溪路站","上海动物园站","宋园路站"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,R.layout.array_item,arr1);
        listView1.setAdapter(adapter1);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Data.this,DataContent.class);
                switch (position){
                    case 0:
                        intent.putExtra("urlout",url1);
                        startActivity(intent);
                        break;

                    case 1:
                        intent.putExtra("urlout",url2);
                        startActivity(intent);
                        break;

                    case 2:
                        intent.putExtra("urlout",url3);
                        startActivity(intent);
                        break;

                }

            }
        });
    }

}

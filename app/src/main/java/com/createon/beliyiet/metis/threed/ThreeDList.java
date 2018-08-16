package com.createon.beliyiet.metis.threed;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.createon.beliyiet.metis.R;

public class ThreeDList extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_dlist);

        list();
    }

    private void list() {

        final ListView listView = (ListView)findViewById(R.id.list_station);
        final String[] list01 = {
                "徐泾东站"
        };
        ArrayAdapter list = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,list01);
        listView.setAdapter(list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ThreeDList.this,Display.class);
                switch (position){
                    case 0:
                        intent.putExtra("file","east_xujing.png");
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}

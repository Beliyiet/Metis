package com.createon.beliyiet.metis.data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import com.createon.beliyiet.metis.R;

public class Data extends AppCompatActivity {

    ImageView imageView0;
    ImageView imageView1;
    ImageView imageView2;
    CardView cardView0;
    CardView cardView1;
    CardView cardView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        imageView0 = (ImageView)findViewById(R.id.data_image0);
        imageView0.setImageResource(R.drawable.data_image_0);
        imageView0.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView1 = (ImageView)findViewById(R.id.data_image1);
        imageView1.setImageResource(R.drawable.data_community_0);
        imageView1.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView2 = (ImageView)findViewById(R.id.data_image2);
        imageView2.setImageResource(R.drawable.data_unit_0);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);

        onDataClick();

    }

    private void onDataClick() {
        cardView0 = (CardView)findViewById(R.id.data_station);
        cardView0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Data.this,StationDataList.class);
                startActivity(intent);
            }
        });

        cardView1 = (CardView)findViewById(R.id.data_community);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Data.this,CommunityDataList.class);
                startActivity(intent);
            }
        });
    }
}

package com.createon.beliyiet.metis.data;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.createon.beliyiet.metis.R;
import com.joanzapata.pdfview.PDFView;

public class DataContent extends AppCompatActivity {

    PDFView pdfView;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        url = intent.getStringExtra("urlout");

        pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset(url).load();

    }

}

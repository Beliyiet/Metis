package com.createon.beliyiet.metis.programming;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.createon.beliyiet.metis.R;
import com.joanzapata.pdfview.PDFView;

public class ProgrammingContent extends AppCompatActivity {

    PDFView pdfView1;
    String url1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming_content);
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

        Intent intent = getIntent();
        url1 = intent.getStringExtra("urlout1");

        pdfView1 = (PDFView)findViewById(R.id.pdfView1);
        pdfView1.fromAsset(url1).load();
    }

}

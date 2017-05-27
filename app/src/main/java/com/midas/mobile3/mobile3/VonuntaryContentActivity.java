package com.midas.mobile3.mobile3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.midas.mobile3.mobile3.db_model.Voluntary;

public class VonuntaryContentActivity extends AppCompatActivity {

    Voluntary data;
    ImageView imgTitle;
    TextView txtTitle, txtExtDate, txtReqDate, txtPoint, txtContents;

    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vonuntary_content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        data = (Voluntary)getIntent().getSerializableExtra("data");

        setLayout();



    }

    private void setLayout(){
        imgTitle = (ImageView)findViewById(R.id.voluntary_contents_img_title);
        if(imgTitle!=null) Glide.with(this).load(data.voluntaryImg).into(imgTitle);


        txtTitle = (TextView)findViewById(R.id.voluntary_contents_title);
        txtExtDate = (TextView)findViewById(R.id.voluntary_contents_excdate);
        txtReqDate = (TextView)findViewById(R.id.voluntary_contents_reqdate);
        txtPoint = (TextView)findViewById(R.id.voluntary_contents_title);
        txtContents = (TextView)findViewById(R.id.voluntary_contents_title);


        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}

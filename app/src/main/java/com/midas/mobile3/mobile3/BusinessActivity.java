package com.midas.mobile3.mobile3;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.midas.mobile3.mobile3.db.RequestDBHelper;
import com.midas.mobile3.mobile3.db_model.Business;
import com.midas.mobile3.mobile3.db_model.Voluntary;
import com.squareup.picasso.Picasso;

import jp.wasabeef.picasso.transformations.BlurTransformation;

public class BusinessActivity extends AppCompatActivity {

    Context mcon;
    Business data;
    ImageView imgTitle;
    TextView txtTitle, txtPoint, txtContents;
    Button btnRequest;

    boolean isDone = false;

    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mcon = this;
        data = (Business) getIntent().getSerializableExtra("data");
        // TODO : 기부활동 했는지 안했는지 가져와야됨
        setLayout();
    }

    private void setLayout(){

        setContentView(R.layout.activity_business);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("기부 활동");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgTitle = (ImageView)findViewById(R.id.business_contents_img_title);
        if(data.businessImgUrl!=null && !data.businessImgUrl.equals("")) {
            Picasso.with(this).load(data.businessImgUrl).into(imgTitle);
        }

        txtTitle = (TextView)findViewById(R.id.business_contents_title);
        txtTitle.setText(data.businessName);

        txtPoint = (TextView)findViewById(R.id.business_contents_point);
        txtPoint.setText(data.businessCurPoint+"원 / "+data.businessGoalPoint+"원");

        txtContents = (TextView)findViewById(R.id.business_contents_contents);
        txtContents.setText(data.businessContent.trim());

        btnRequest = (Button) findViewById(R.id.business_contents_request);
        btnRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requestBusiness();
            }
        });

        //여기서 봉사활동 신청.
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requestBusiness();
            }
        });
    }

    private void requestBusiness(){
        if(!isDone) {
            //봉사활동 신청이 안되어 있을 경우
            RequestDBHelper rdbh = new RequestDBHelper(mcon);
            //rdbh.insert(Common.userCode, data.voluntaryCode);

            Snackbar.make(fab, data.businessName + " 신청이 완료되었습니다.", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            fab.setImageResource(R.drawable.ic_remove_black_24dp);
            btnRequest.setText("기부 완료");
            isDone=true;
        }else{
            Snackbar.make(fab, "이미 기부하였습니다.", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

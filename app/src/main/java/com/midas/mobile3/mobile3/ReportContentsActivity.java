package com.midas.mobile3.mobile3;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.midas.mobile3.mobile3.db_model.Business;

public class ReportContentsActivity extends AppCompatActivity {

    // TODO : 데이터 모델 바꿔야됨

    Context mcon;
    Business data;
    TextView txtTitle, txtPoint, txtContents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mcon = this;
        data = (Business) getIntent().getSerializableExtra("data");
        setLayout();
    }

    private void setLayout(){

        setContentView(R.layout.activity_report_contents);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("사업 결과");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtTitle = (TextView)findViewById(R.id.report_contents_title);
        txtTitle.setText(data.businessName);

        txtPoint = (TextView)findViewById(R.id.report_contents_point);
        txtPoint.setText(data.businessCurPoint+"원");

        txtContents = (TextView)findViewById(R.id.report_contents_contents);
        txtContents.setText(data.businessContent.trim());

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

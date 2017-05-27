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
import com.midas.mobile3.mobile3.db.RequestDBHelper;
import com.midas.mobile3.mobile3.db.UserDBHelper;
import com.midas.mobile3.mobile3.db.VoluntaryDBHelper;
import com.midas.mobile3.mobile3.db_model.Voluntary;

public class VonuntaryContentActivity extends AppCompatActivity {

    Voluntary data;
    ImageView imgTitle;
    TextView txtTitle, txtExtDate, txtReqDate, txtPoint, txtContents;

    boolean isDone = false;

    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = (Voluntary)getIntent().getSerializableExtra("data");
        // TODO : 봉사활동 했는지 안했는지 가져와야됨
        setLayout();
    }

    private void setLayout(){

        setContentView(R.layout.activity_vonuntary_content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(data.voluntaryTitle);
        setSupportActionBar(toolbar);

        imgTitle = (ImageView)findViewById(R.id.voluntary_contents_img_title);
        if(imgTitle!=null) Glide.with(this).load(data.voluntaryImg).into(imgTitle);

        txtTitle = (TextView)findViewById(R.id.voluntary_contents_title);
        txtTitle.setText(data.voluntaryTitle);

        txtExtDate = (TextView)findViewById(R.id.voluntary_contents_excdate);
        txtExtDate.setText(data.voluntaryExcStartDate + " ~ "+ data.voluntaryExcEndDate);

        txtReqDate = (TextView)findViewById(R.id.voluntary_contents_reqdate);
        txtReqDate.setText(data.voluntaryReqStartDate + "~" + data.voluntaryReqEndDate);

        txtPoint = (TextView)findViewById(R.id.voluntary_contents_point);
        txtPoint.setText(data.voluntaryPoint+"");

        txtContents = (TextView)findViewById(R.id.voluntary_contents_contents);
        txtContents.setText(data.voluntaryContent);

        //여기서 봉사활동 신청.
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isDone) {
                    //봉사활동 신청이 안되어 있을 경우
                    Snackbar.make(view, data.voluntaryTitle + " 신청이 완료되었습니다.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    fab.setImageResource(R.drawable.ic_remove_black_24dp);
                    isDone=true;
                }else{

                    Snackbar.make(view, data.voluntaryTitle + " 취소가 완료되었습니다.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    fab.setImageResource(R.drawable.ic_add_black_24dp);
                    isDone=false;
                }
                // TODO : DBupdate
            }
        });
    }
}

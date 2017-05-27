package com.midas.mobile3.mobile3;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.midas.mobile3.mobile3.controller.PointThingAdapter;

public class AdminAddActivity extends AppCompatActivity {

    EditText editTitle, editReqStart,editReqEnd,editExcStart,editExcEnd,editPrice, editURL, editContents;
    Button btnComplete;
    Context mCon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add);
        mCon = this;
        setLayout();
    }

    private void setLayout(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("봉사활동 추가");
        setSupportActionBar(toolbar);

        editTitle=(EditText)findViewById(R.id.admin_edit_titlename);
        editPrice=(EditText)findViewById(R.id.admin_edit_price);
        editReqStart=(EditText)findViewById(R.id.admin_edit_req_start);
        editReqEnd=(EditText)findViewById(R.id.admin_edit_req_end);
        editExcStart=(EditText)findViewById(R.id.admin_edit_req_start);
        editExcEnd=(EditText)findViewById(R.id.admin_edit_req_end);

        editURL=(EditText)findViewById(R.id.admin_edit_url);
        editContents=(EditText)findViewById(R.id.admin_edit_contents);

        btnComplete =(Button)findViewById(R.id.admin_btn);
        btnComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO : 긁어서 DB ㄱㄱㄱㄱㄱㄱㄱㄱ

                Toast.makeText(mCon,"성공적으로 등록되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });
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

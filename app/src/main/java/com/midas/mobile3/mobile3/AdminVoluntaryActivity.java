package com.midas.mobile3.mobile3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.midas.mobile3.mobile3.controller.AdminVoluntaryAdapter;
import com.midas.mobile3.mobile3.controller.PointThingAdapter;

public class AdminVoluntaryActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    AdminVoluntaryAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_voluntary);
        setLayout();
    }

    private void setLayout(){
        mRecyclerView = (RecyclerView)findViewById(R.id.list);
        mAdapter = new AdminVoluntaryAdapter(this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
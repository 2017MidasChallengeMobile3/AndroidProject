package com.midas.mobile3.mobile3;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.midas.mobile3.mobile3.controller.PointThingAdapter;

public class AdminAddActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    PointThingAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_voluntary);
        setLayout();
    }

    private void setLayout(){
        mRecyclerView = (RecyclerView)findViewById(R.id.list);
        //mAdapter = new AdminVoluntaryActivity(this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

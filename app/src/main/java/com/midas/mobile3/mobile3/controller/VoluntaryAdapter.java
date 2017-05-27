package com.midas.mobile3.mobile3.controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.midas.mobile3.mobile3.R;
import com.midas.mobile3.mobile3.db_model.Voluntary;
import com.midas.mobile3.mobile3.models.VoluntaryHolder;

/**
 * Created by myRoom on 2017-05-27.
 */

public class VoluntaryAdapter extends RecyclerView.Adapter<VoluntaryHolder>{

    Context mcon;

    public VoluntaryAdapter(Context mcon){
        this.mcon=mcon;
    }


    @Override
    public VoluntaryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mcon).inflate(R.layout.item_voluntary,parent,false);
        return new VoluntaryHolder(v, mcon);
    }

    @Override
    public void onBindViewHolder(VoluntaryHolder holder, int position) {
        // position 째 데이터를 받아와서
        // holder. setData 호출
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

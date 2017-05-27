package com.midas.mobile3.mobile3.models;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.midas.mobile3.mobile3.R;
import com.midas.mobile3.mobile3.VonuntaryContentActivity;
import com.midas.mobile3.mobile3.db_model.Voluntary;

import java.text.SimpleDateFormat;

/**
 * Created by koohanmo on 2017-05-27.
 */
public class PointHolder extends RecyclerView.ViewHolder{

    Voluntary data;
    TextView txtTitle, txtDate, txtPoint;
    ImageView img;
    Context mcon;

    public PointHolder(View itemView, final Context mcon) {
        super(itemView);
        this.mcon = mcon;
        txtTitle = (TextView)itemView.findViewById(R.id.voluntary_recycler_item_title);
        txtDate = (TextView)itemView.findViewById(R.id.voluntary_recycler_item_date);
        txtPoint = (TextView)itemView.findViewById(R.id.voluntary_recycler_item_point);
        img = (ImageView)itemView.findViewById(R.id.voluntary_recycler_item_img);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mcon, VonuntaryContentActivity.class);
                i.putExtra("data",data);
                mcon.startActivity(i);
            }
        });
    }

    public void setData(Voluntary data){
        String reqStart = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(data.voluntaryReqStartDate);
        String reqEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(data.voluntaryReqStartDate);

        this.data = data;
        txtTitle.setText(data.voluntaryTitle);
        txtDate.setText(data.voluntaryReqStartDate+ " ~ " + data.voluntaryReqEndDate);
        txtPoint.setText(data.voluntaryPoint+"P");
        Glide.with(mcon).load(data.voluntaryImg).into(img);
    }
}
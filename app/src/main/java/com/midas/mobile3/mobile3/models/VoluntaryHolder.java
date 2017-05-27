package com.midas.mobile3.mobile3.models;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.midas.mobile3.mobile3.R;
import com.midas.mobile3.mobile3.db_model.Voluntary;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by koohanmo on 2017-05-27.
 */
public class VoluntaryHolder extends RecyclerView.ViewHolder{

    Voluntary data;
    TextView txtTitle, txtDate, txtPoint;
    ImageView img;

    Context mcon;

    public VoluntaryHolder(View itemView, final Context mcon) {
        super(itemView);
        this.mcon = mcon;
        txtTitle = (TextView)itemView.findViewById(R.id.voluntary_recycler_item_title);
        txtDate = (TextView)itemView.findViewById(R.id.voluntary_recycler_item_date);
        txtPoint = (TextView)itemView.findViewById(R.id.voluntary_recycler_item_point);
        img = (ImageView)itemView.findViewById(R.id.voluntary_recycler_item_img);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mcon,"Item clicked!!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setData(Voluntary data){
        String reqStart = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(data.voluntaryReqStartDate);
        String reqEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(data.voluntaryReqStartDate);

        txtTitle.setText(data.voluntaryTitle);
        txtDate.setText(reqStart+ " ~ " + reqEnd);
        txtPoint.setText(data.voluntaryPoint+"P");
        Glide.with(mcon).load(data.voluntaryImg).into(img);
    }
}
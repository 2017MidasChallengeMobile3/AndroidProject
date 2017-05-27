package com.midas.mobile3.mobile3.models;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.midas.mobile3.mobile3.Common;
import com.midas.mobile3.mobile3.MainActivity;
import com.midas.mobile3.mobile3.R;
import com.midas.mobile3.mobile3.VoluntaryFragment;
import com.midas.mobile3.mobile3.VonuntaryContentActivity;
import com.midas.mobile3.mobile3.db_model.PointThing;
import com.midas.mobile3.mobile3.db_model.Voluntary;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by koohanmo on 2017-05-27.
 */
public class PointThingHolder extends RecyclerView.ViewHolder{

    PointThing data;
    TextView txtDate, txtPoint;
    Context mcon;

    public PointThingHolder(View itemView, final Context mcon) {
        super(itemView);
        this.mcon = mcon;
        txtDate = (TextView)itemView.findViewById(R.id.point_recycler_item_date);
        txtPoint = (TextView)itemView.findViewById(R.id.point_recycler_item_point);

        /*itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mcon, VonuntaryContentActivity.class);
                i.putExtra("data",data);
                mcon.startActivity(i);
            }
        });*/
    }

    public void setData(PointThing data){
        this.data = data;
        txtDate.setText(Common.dateToString(data.date));

        if( data.sort == 1 ){
            txtPoint.setText("+ "+data.point+"P");
            txtPoint.setTextColor(Color.parseColor("#0000FF"));
        }
        else{
            txtPoint.setText("- "+data.point+"P");
            txtPoint.setTextColor(Color.parseColor("#FF0000"));
        }
    }
}
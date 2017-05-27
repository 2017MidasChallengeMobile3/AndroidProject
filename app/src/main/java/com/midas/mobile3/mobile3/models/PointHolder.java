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

    //TODO 데이터 모델 바꿔야함
    Voluntary data;
    TextView txtTitle, txtDate, txtPoint, txtLeftPoint;
    Context mcon;

    public PointHolder(View itemView, final Context mcon) {
        super(itemView);
        this.mcon = mcon;
        txtTitle = (TextView)itemView.findViewById(R.id.point_title);
        txtDate = (TextView)itemView.findViewById(R.id.point_date);
        txtPoint = (TextView)itemView.findViewById(R.id.point_point);
        txtLeftPoint = (TextView)itemView.findViewById(R.id.point_left_point);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO : 결정해야됨 띄울지 말지
//                Intent i = new Intent(mcon, VonuntaryContentActivity.class);
//                i.putExtra("data",data);
//                mcon.startActivity(i);
            }
        });
    }

    public void setData(Voluntary data){
        String reqStart = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(data.voluntaryReqStartDate);
        String reqEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(data.voluntaryReqStartDate);

        // TODO : 데이터에 맞게 조정해줘야됨
        this.data = data;
        txtTitle.setText(data.voluntaryTitle);
        txtDate.setText(data.voluntaryReqStartDate+ " ~ " + data.voluntaryReqEndDate);
        txtPoint.setText(data.voluntaryPoint);
        txtLeftPoint.setText(data.voluntaryPoint);
    }
}
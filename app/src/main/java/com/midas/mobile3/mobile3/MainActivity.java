package com.midas.mobile3.mobile3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final long FINISH_INTERVAL_TIME = 2000;
    private long backPressedTime =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        long tempTime = System.currentTimeMillis();
        long intervalTiem = tempTime - backPressedTime;

        if(intervalTiem >=0 && intervalTiem <= FINISH_INTERVAL_TIME){

            Toast.makeText(this,"1번 더 누르면 종료됩니다.",Toast.LENGTH_SHORT).show();
        }else{
            finish();
        }
    }
}

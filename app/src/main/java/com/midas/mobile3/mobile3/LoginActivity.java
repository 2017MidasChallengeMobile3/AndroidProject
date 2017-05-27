package com.midas.mobile3.mobile3;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.midas.mobile3.mobile3.db.VoluntaryDBHelper;

import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class LoginActivity extends AppCompatActivity {



    EditText editID,editPassword;
    Button btnLogin, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        setLayout();

        insertDummyData();
    }

    private void insertDummyData(){
        // 임의 더미데이터 생성 - 나중에 지울것
        VoluntaryDBHelper vdbh = new VoluntaryDBHelper(this);
        String str1="2017-05-20 11:22:33.444";
        String str2="2017-05-21 12:23:33.444";
        String str3="2017-05-29 13:24:33.444";
        String str4="2017-05-30 14:25:33.444";
        Timestamp timestamp1 = null;
        Timestamp timestamp2 = null;
        Timestamp timestamp3 = null;
        Timestamp timestamp4 = null;

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str1);
            timestamp1 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception
            //look the origin of excption
        }

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str2);
            timestamp2 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception
            //look the origin of excption
        }

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str3);
            timestamp3 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception
            //look the origin of excption
        }

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str4);
            timestamp4 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception
            //look the origin of excption
        }

        vdbh.insert("봉사활동1", timestamp1, timestamp2, timestamp3, timestamp4, 100, "연탄나르는 봉사", 0, "");

        str1="2017-05-10 09:22:33.444";
        str2="2017-05-11 10:23:33.444";
        str3="2017-06-29 13:24:33.444";
        str4="2017-07-30 14:25:33.444";

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str1);
            timestamp1 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception
            //look the origin of excption
        }

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str2);
            timestamp2 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception
            //look the origin of excption
        }

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str3);
            timestamp3 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception
            //look the origin of excption
        }

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str4);
            timestamp4 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception
            //look the origin of excption
        }

        vdbh.insert("봉사활동2", timestamp1, timestamp2, timestamp3, timestamp4, 200, "연탄나르는 봉사2", 0, "");

        str1="2017-04-10 09:22:33.444";
        str2="2017-04-11 10:23:33.444";
        str3="2017-06-29 13:24:33.444";
        str4="2017-07-30 14:25:33.444";

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str1);
            timestamp1 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception

        }

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str2);
            timestamp2 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception

        }

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str3);
            timestamp3 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception

        }

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str4);
            timestamp4 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception

        }

        vdbh.insert("봉사활동3", timestamp1, timestamp2, timestamp3, timestamp4, 300, "연탄나르는 봉사3", 0, "");

        str1="2017-07-10 09:22:33.444";
        str2="2017-07-11 10:23:33.444";
        str3="2017-09-29 13:24:33.444";
        str4="2017-09-30 14:25:33.444";

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str1);
            timestamp1 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception

        }

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str2);
            timestamp2 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception

        }

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str3);
            timestamp3 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception

        }

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str4);
            timestamp4 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception

        }

        vdbh.insert("봉사활동4", timestamp1, timestamp2, timestamp3, timestamp4, 500, "달리기봉사1", 0, "data:image/jpeg;base64,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");



        str1="2017-08-10 09:22:33.444";
        str2="2017-08-11 10:23:33.444";
        str3="2017-09-29 13:24:33.444";
        str4="2017-09-30 14:25:33.444";
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str1);
            timestamp1 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception

        }

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str2);
            timestamp2 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception

        }

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str3);
            timestamp3 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception

        }

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str4);
            timestamp4 = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception

        }

        vdbh.insert("봉사활동5", timestamp1, timestamp2, timestamp3, timestamp4, 900, "달리기봉사2", 0, "");
    }

    private void setLayout(){
        editID = (EditText)findViewById(R.id.login_edit_id);
        editPassword = (EditText)findViewById(R.id.login_edit_password);

        btnLogin = (Button)findViewById(R.id.login_btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO : 실제 로그인 해야됨

                Intent i = new Intent(LoginActivity.this,MainActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
            }
        });

        btnSignup = (Button)findViewById(R.id.login_btn_signup);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}

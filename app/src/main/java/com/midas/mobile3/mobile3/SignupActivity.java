package com.midas.mobile3.mobile3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.midas.mobile3.mobile3.db.UserDBHelper;
import com.midas.mobile3.mobile3.db_model.User;

public class SignupActivity extends AppCompatActivity {
    Button signUpbutton;
    EditText signUpname;
    EditText signUpid;
    EditText signUppassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button signUpbutton = (Button)findViewById(R.id.signUpbtn);
        signUpname = (EditText)findViewById(R.id.signup_edit_name);
        signUpid = (EditText)findViewById(R.id.signup_edit_id);
        signUppassword = (EditText)findViewById(R.id.signup_edit_password);

        signUpbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //여기서 회원가입에 대한 것이 나와야함.
                //아이디가 존재하면 안됨.
                //가입되면 insert한다.
                startsignUp();
                Intent i = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
    public void startsignUp(){
        UserDBHelper udbh = new UserDBHelper(this);
        User user = new User();
        user = udbh.selectUserInfo(signUpid.getText().toString());
        if(user==null){//같은 아이디가 없으므로 승인.
            udbh.insert(2,signUpid.getText().toString(),signUppassword.getText().toString(),signUpname.getText().toString(),0);
            Toast.makeText(SignupActivity.this,"회원가입에 성공했습니다.",Toast.LENGTH_SHORT).show();
        }
        else{//같은 아이디가 있으므로 승인x.
            Toast.makeText(SignupActivity.this,"이미 존재하는 ID입니다",Toast.LENGTH_SHORT).show();
            signUpid.setText("");
            signUpname.setText("");
            signUppassword.setText("");
        }
    }
}

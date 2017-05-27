package com.midas.mobile3.mobile3;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private long backPressedTime =0;
    private Toast exitToast;

    private Toolbar toolbar;

    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setLayout();
    }

    private void setLayout(){
        toolbar = (Toolbar)findViewById(R.id.appbar);
        setSupportActionBar(toolbar);

        //tabLayout = (TableLayout)findViewById(R.id.)


    }


    @Override
    public void onBackPressed() {
        if(System.currentTimeMillis() > backPressedTime+2000){
            exitToast= Toast.makeText(this,"1번 더 누르면 종료됩니다.",Toast.LENGTH_SHORT);
            exitToast.show();
            backPressedTime = System.currentTimeMillis();
        }else{
            if(exitToast!=null) exitToast.cancel();
            finish();
        }
    }


    private class TabPageAdapter extends FragmentStatePagerAdapter{

        private int tabCount;

        public TabPageAdapter(FragmentManager fm, int tabCount){
            super(fm);
            this.tabCount=3;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: break;
                case 1: break;
                case 2: break;
            }
            return null;
        }

        @Override
        public int getCount() {
            return tabCount;
        }
    }
}


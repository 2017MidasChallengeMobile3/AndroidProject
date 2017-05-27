package com.midas.mobile3.mobile3;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private long backPressedTime =0;
    private Toast exitToast;

    private Toolbar toolbar;

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private final String menuNames[] = {"봉사활동", "활동내역", "기부하기", "포인트"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setLayout();
    }

    private void setLayout(){
        tabLayout = (TabLayout)findViewById(R.id.main_tab);
        for(String name : menuNames){
            tabLayout.addTab(tabLayout.newTab().setText(name));
        }
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager = (ViewPager) findViewById(R.id.main_viewpager);

        TabPageAdapter pageAdapter = new TabPageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


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
        VoluntaryFragment fragment1;
        VoluntaryCheckFragment fragment2;
        BusinessFragment fragment3;
        PointFragment fragment4;

        public TabPageAdapter(FragmentManager fm, int tabCount){
            super(fm);
            this.tabCount=tabCount;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    if(fragment1==null){
                        fragment1 = new VoluntaryFragment();
                    }
                    return fragment1;
                case 1:
                    if(fragment2==null){
                        fragment2 = new VoluntaryCheckFragment();
                    }
                    return fragment2;
                case 2:
                    if(fragment3==null){
                        fragment3 = new BusinessFragment();
                    }
                    return fragment3;
                case 3:
                    if(fragment4==null){
                        fragment4 = new PointFragment();
                    }
                    return fragment4;

            }
            return null;
        }

        @Override
        public int getCount() {
            return tabCount;
        }
    }
}


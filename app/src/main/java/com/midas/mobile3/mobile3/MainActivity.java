package com.midas.mobile3.mobile3;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.midas.mobile3.mobile3.db.BusinessDBHelper;

public class MainActivity extends AppCompatActivity {

    public static VoluntaryFragment voluntaryFragment;
    public static VoluntaryCheckFragment voluntaryCheckFragment;
    public static BusinessFragment businessFragment;
    public static ReportFragment reportFragment;
    public static PointFragment pointFragment;

    private long backPressedTime =0;

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private FloatingActionButton fab;


    private CoordinatorLayout mainLayout;

    private final String menuNames[] = {"봉사활동", "활동내역", "기부하기","사업결과", "포인트"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        insertDummyData();
        setLayout();
    }

    private void setLayout(){
        mainLayout = (CoordinatorLayout)findViewById(R.id.main_content) ;

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


        // TODO : 관리자이면 보이고 아니면 VISIBLE.GONE

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //tabLayout.getPointerIcon()

            }
        });
    }


    @Override
    public void onBackPressed() {
        if(System.currentTimeMillis() > backPressedTime+2000){
            Snackbar.make(mainLayout, "1번 더 누르면 종료됩니다.", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            backPressedTime = System.currentTimeMillis();
        }else{
            finish();
        }
    }


    private class TabPageAdapter extends FragmentStatePagerAdapter{

        private int tabCount;


        public TabPageAdapter(FragmentManager fm, int tabCount){
            super(fm);
            this.tabCount=tabCount;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    if(voluntaryFragment==null){
                        voluntaryFragment = new VoluntaryFragment();
                    }
                    return voluntaryFragment;
                case 1:
                    if(voluntaryCheckFragment==null){
                        voluntaryCheckFragment = new VoluntaryCheckFragment();
                    }
                    return voluntaryCheckFragment;
                case 2:
                    if(businessFragment==null){
                        businessFragment = new BusinessFragment();
                    }
                    return businessFragment;
                case 3:
                    if(reportFragment==null){
                        reportFragment = new ReportFragment();
                    }
                    return reportFragment;

                case 4:
                    if(pointFragment==null){
                        pointFragment = new PointFragment();
                    }
                    return pointFragment;


            }
            return null;
        }

        @Override
        public int getCount() {
            return tabCount;
        }
    }

    private void insertDummyData(){
        BusinessDBHelper bdbh = new BusinessDBHelper(this);
        String bName="여러분들 덕에 내가 삽니더";
        String bContent="자원봉사자들이 밑반찬을 직접 만들고 배달해 줌으로써 봉화군 독거 어르신들이 \n" +
                "건강을 유지하실 뿐 아니라 지역사회 속에서 유대관계를 경험하고 유지하면서 심리적 안정을 누리게 됩니다.";
        String bUrl="http://happybean.phinf.naver.net/20161130_119/hlog_h07084_1480475445557C3JE6_JPEG/%C5%EB%C0%CC%B9%CC%C1%F6jpg?type=w720";
        bdbh.insert(bName,bContent,1000000,0,bUrl);

        bName="소녀가장 할머니의 치과진료를 지원해주세요";
        bContent="홀로 남은 소녀가장 엄가영 어르신(가명)에게 치과진료를 지원합니다.\n" +
                "홀로 남은 소녀가장 엄가영 어르신(가명)에게 12개월 식료품을 지원합니다." +
                "엄가영 어르신(가명)의 치과진료를 통해 영양 불균형을 해소하여 건강상태 회복지원";
        bUrl="http://happybean.phinf.naver.net/20170214_143/hlog_e03258_14870517017694L0np_JPEG/photo_1486538470jpg?type=w720";
        bdbh.insert(bName,bContent,5000000,0,bUrl);

        bName="소리없는 세상을 살아가는 어르신";
        bContent="인공달팽이관 수술 지원으로 듣지 못해 사회적으로 소외되고 있는 어르신에게 소리를 찾아주어 \n" +
                "사회와 소통 할 수 있는 발판을 마련해주고, 소통의 부재로 인한 고독사를 방지합니다.";
        bUrl="http://happybean.phinf.naver.net/20170207_148/hlog_s02634_1486429594460WXuEW_JPEG/%C7%D2%BE%C6%B9%F6%C1%F6%C4%BF%B9%F6jpg?type=w720";
        bdbh.insert(bName,bContent,6000000,0,bUrl);

        bName="하루하루 살아가기 위해 폐휴지를 줍는 어르신들";
        bContent="1. 생계형 폐휴지 수거 어르신들의 교통사고률 50% 감소\n" +
                "2. 생계형 폐휴지 수거 어르신들의 삶의 질 향상\n" +
                "3. 생계형 폐휴지 수거 어르신들의 생계물품지원 12회 이상\n" +
                "4. 생계형 폐휴지 수거 어르신들의 생계 증대";
        bUrl="http://happybean.phinf.naver.net/20160801_61/hlog_m06140_14700480282429xNPl_JPEG/IMG_7794.JPG?type=w720";
        bdbh.insert(bName,bContent,9000000,0,bUrl);

        bName="어르신들의 따뜻한 한 끼를 지켜주세요";
        bContent="홀로 사는 어르신의 건강증진을 도모하고자 광주 서구 지역에 거주중인 독거어르신 댁에 주1회 밑반찬을 배달 드리고자 합니다.\n";
        bUrl="http://happybean.phinf.naver.net/20170207_101/hlog_s03859_1486424923441iU6GA_JPEG/%BB%E7%C1%F8_3.JPG?type=w720";
        bdbh.insert(bName,bContent,4000000,0,bUrl);
    }
}


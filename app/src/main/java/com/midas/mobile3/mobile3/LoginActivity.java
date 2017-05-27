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

import com.midas.mobile3.mobile3.db.CompleteDBHelper;
import com.midas.mobile3.mobile3.db.DonationDBHelper;
import com.midas.mobile3.mobile3.db.UserDBHelper;
import com.midas.mobile3.mobile3.db.VoluntaryDBHelper;
import com.midas.mobile3.mobile3.db_model.User;

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

        str1="2017-02-16 00:00:00.000";
        str2="2017-05-27 23:59:59.000";
        str3="2017-03-04 00:00:00.000";
        str4="2017-06-03 23:59:59.000";

        String volContent="1. 일시 : 매주 토요일 오후 2시부터 5시까지 \n" +
                "2. 장소 : 구세군 다문화센터 \n" +
                "3. 자격 : 이주민 무료급식을 위해 봉사 하실 분 \n" +
                "4. 기타 : 반드시 봉사하실 분만 신청하시고 승인 확인 후에 봉사 가능 \n";

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


        vdbh.insert("구세군 다문화센터-이주민 무료급식 봉사", timestamp1, timestamp2, timestamp3, timestamp4, 250, volContent, 0, "http://www.jasunnambi.or.kr/nr/files/2013/12/23/f5f1c83d23859c6885c3b1d3cf788043120349.jpg");

        str1="2017-02-11 00:00:00.000";
        str2="2017-06-30 23:59:59.000";
        str3="2017-03-04 00:00:00.000";
        str4="2017-06-30 23:59:59.000";

        volContent="1.목적 : 큰나무작은도서관에서는 제3세계 어린이 가정을 위한 사랑의 천연비누를 만듭니다. \n" +
                "전문강사님의 지도로 천연비누를 정성껏 2개 만들어 하나는 본인이, 하나는 어려운 제3세계아이들 가정에 기부하여 사랑의 나눔과 베품을 배울 수 있는 시간을 갖게 되는 프로그램입니다. 그리고 천연비누를 만들면서 나눔에 대한 시청각교육을 통해 나눔을 체험할 수 있고 지구촌에 사는 어려운 이웃을 생각하며 배려하는 소중한 시간입니다. \n" +
                "자원봉사자들이 만든 천연비누는 국제기아대책기구를 통하여 제3세계 어려운 어린이 가정에 전달됩니다. \n" +
                "2.시간 : 매주 토요일 오후1시   \n" +
                "3.장소 : 수원시 팔달구 우만동 501-13번지 큰나무작은도서관(수원엘림교회)";

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


        vdbh.insert("제3세계 어린이를 위한 천연비누 만들기", timestamp1, timestamp2, timestamp3, timestamp4, 300, volContent, 0, "http://www.okinews.com/news/photo/201308/60517_35603_5722.jpg");


        str1="2017-02-27 00:00:00.000";
        str2="2017-07-30 23:59:59.000";
        str3="2017-03-06 00:00:00.000";
        str4="2017-08-15 23:59:59.000";

        volContent="1. 활동일시: 월요일, 수요일, 금요일중 협의 \n" +
                "2. 활동내용: 초등 저학년 대상 미술관련활동(그리기,수채화) \n" +
                "3. 활동시간: 전화로 문의하여 주세요~ \n" +
                "4. 모집인원: 1-3명이상 \n" +
                "**전화신청만 받습니다.053-353-3017";

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


        vdbh.insert("초등 저학년 대상 미술 봉사", timestamp1, timestamp2, timestamp3, timestamp4, 150, volContent, 0, "http://cfile5.uf.tistory.com/image/16792D3F515BB32C157738");


        str1="2017-04-27 00:00:00.000";
        str2="2017-09-02 23:59:59.000";
        str3="2017-05-15 00:00:00.000";
        str4="2017-09-15 23:59:59.000";

        volContent="봉사내용 : 아프리카 말라위 신생아 털모자를 뜨는 봉사\n" +
                "봉사자모집대상 : 중, 고등학생\n" +
                "봉사일시 : 매주 토요일(오후2시-5시)\n" +
                "봉사장소 : 용산구 한강대로98가길 11 (갈월동 7-109) 용산교회2층";

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


        vdbh.insert("아프리카 신생아 털모자뜨기 봉사", timestamp1, timestamp2, timestamp3, timestamp4, 400, volContent, 0, "http://cfile5.uf.tistory.com/image/1608C0395084AB5F1BF60F");


        str1="2017-02-27 00:00:00.000";
        str2="2017-06-14 23:59:59.000";
        str3="2017-05-15 00:00:00.000";
        str4="2017-09-30 23:59:59.000";

        volContent="장애인활동지원과 식사보조및 말벗봉사입니다. \n" +
                "시각장애인 화장실도우미와 다른장애분들 식사도우미하시고 말벗하시면 됩니다. \n" +
                "봉사자는 성인분만 가능하며 3개월동안 꾸준히 오셔야합니다. 꼭!꼭!꼭! 꾸준히 오실분만 신청해주세요. \n" +
                "문의= (010-9098-6303) 신청만 하시고 안오시면 안됩니다.";

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


        vdbh.insert("장애인 활동 보조 및 식사 보조", timestamp1, timestamp2, timestamp3, timestamp4, 300, volContent, 0, "http://cfile1.uf.tistory.com/image/265D0843577B1E3B1510DA");


        str1="2017-03-15 00:00:00.000";
        str2="2017-06-20 23:59:59.000";
        str3="2017-04-01 00:00:00.000";
        str4="2017-07-15 23:59:59.000";

        volContent="1. 봉사 일시 :2017년4월1월~5월27일 \n" +
                "2. 활동장소: 영통육아종합지원센터 3층 장난감도서관 \n" +
                "3. 봉사내용: 장난감 소독 및 세척 \n" +
                "4. 준비물 : 편안한 복장 \n" +
                "5. 담당자: 이경희(273-3390)";

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


        vdbh.insert("영통도서관 내 장난감 소독 및 세척", timestamp1, timestamp2, timestamp3, timestamp4, 100, volContent, 0, "http://cphoto.asiae.co.kr/listimglink/6/2013062710422851792_1.jpg");

        str1="2017-03-25 00:00:00.000";
        str2="2017-05-29 23:59:59.000";
        str3="2017-03-30 00:00:00.000";
        str4="2017-09-01 23:59:59.000";

        volContent="일시: 매월 마지막주 토요일 오전 9시~13시(4시간)\n" +
                "장소: 신풍동 92-2 행궁아해꿈누리 마당 (행궁동주민센터 옆 -한옥건물)\n" +
                "활동내용: 전통놀이터 관리봉사(영유아 가족이 이용고객)-놀잇감 이용안내, 정리, 사용대장관리\n" +
                "필요인원:청소년(고교생이상), 대학생 및 직장인 등 성인 2명";

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


        vdbh.insert("행궁아해꿈누리 관리봉사", timestamp1, timestamp2, timestamp3, timestamp4, 270, volContent, 0, "http://www.noriyon.co.kr/data/file/sub03_01/thumb-3552730100_JFz92A8X_11050806_742978235824004_1880866285416581510_n_600x338.jpg");


        str1="2017-03-21 00:00:00.000";
        str2="2017-09-17 23:59:59.000";
        str3="2017-04-21 00:00:00.000";
        str4="2017-10-11 23:59:59.000";

        volContent="시간 및 장소 : 10시 박물관 1층 사무실\n" +
                "지참물 : 본인 확인을 위한 신분증(학생증) 지참\n" +
                "복 장 : 활동하기 편안하고 단정한 복장 (추위를 대비하여 따뜻하게 입고오세요)\n" +
                "집결장소에 모여 본인 출석 확인 (1365 가입자 아이디 기입 등)";

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


        vdbh.insert("유기농페스티벌 자원봉사자 모집", timestamp1, timestamp2, timestamp3, timestamp4, 120, volContent, 0, "http://4.bp.blogspot.com/-2bVuhXG0Jhg/VEcpbKM6iRI/AAAAAAAAORA/aLWUbSth5Ls/s1600/%EB%B8%94%EB%9F%AC%EA%B7%B8%2B%EB%82%A8%EC%96%91%EC%A3%BC%2B%EC%8A%AC%EB%A1%9C%EC%9A%B0%EB%9D%BC%EC%9D%B4%ED%94%84%EB%AC%BC%EC%9D%98%EC%A0%95%EC%9B%90%2B%EB%84%A4%EC%9D%B4%EB%B2%84%2B7205.JPG");

        str1="2017-04-03 00:00:00.000";
        str2="2017-07-21 23:59:59.000";
        str3="2017-04-21 00:00:00.000";
        str4="2017-09-24 23:59:59.000";

        volContent="토일 12시부터 5시까지 체험 및 행사 보조 자봉을 구합니다. (봉사시간 5시간 인정)\n" +
                "고등학생 이상 부터 지원해주세요\n" +
                "12시부터 시작이므로 미리 식사는 하고 오세요~\n" +
                "11월까지 계속 행사를 할 예정이므로 꾸준히 신청해주세요\n" +
                "문의사항은 287-6305 로 연락주세요";

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


        vdbh.insert("전주전통술박물관 활동보조", timestamp1, timestamp2, timestamp3, timestamp4, 270, volContent, 0, "http://cfile227.uf.daum.net/image/2377FE3C53A163B203A4D3");

        str1="2017-04-29 00:00:00.000";
        str2="2017-05-30 23:59:59.000";
        str3="2017-05-01 00:00:00.000";
        str4="2017-07-01 23:59:59.000";

        volContent="1. 활동일시 : 2017년 5월 13일~5월 27일 매주 토요일 15:00~18:00 (3시간 활동)\n" +
                "2. 활동장소 : 시민공원 안용복 세미나실\n" +
                "3. 활동내용 : 양성평등 및 좋은부모되기 교육 및 홍보 활동\n" +
                "4. 문의사항 : 한미상담심리학회 장수진 051-246-2781";

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


        vdbh.insert("좋은부모되기 교육 및 홍보 활동", timestamp1, timestamp2, timestamp3, timestamp4, 220, volContent, 0, "http://news20.busan.com/content/image/2017/04/02/20170402000089_0.jpg");

        CompleteDBHelper cdbh = new CompleteDBHelper(this);
        String str="2017-05-01 00:00:00.000";
        Timestamp timestamp = null;

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str);
            timestamp = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception
        }

        cdbh.insert(timestamp, Common.userCode, 8);
        cdbh.insert(Common.userCode, 7);

        str="2017-05-05 00:00:00.000";
        timestamp = null;

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(str);
            timestamp = new java.sql.Timestamp(parsedDate.getTime());
        }catch(Exception e){//this generic but you can control another types of exception
        }

        DonationDBHelper ddbh = new DonationDBHelper(this);
        ddbh.insert(Common.userCode, 1, 100);
        ddbh.insert(timestamp, Common.userCode, 3, 200);
    }

    private void setLayout(){
        editID = (EditText)findViewById(R.id.login_edit_id);
        editPassword = (EditText)findViewById(R.id.login_edit_password);

        btnLogin = (Button)findViewById(R.id.login_btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO : 실제 로그인 해야됨
                //if(isChecked(editID.getText().toString()).booleanValue()==true) {//로그인 성공.
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);

                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(i);
                //}
                //else{//로그인 실패.
                    //Toast.makeText(LoginActivity.this,"아이디 혹은 비밀번호가 틀립니다.",Toast.LENGTH_SHORT).show();
                //}
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

    public Boolean isChecked(String id){
        UserDBHelper udbh = new UserDBHelper(this);
        User user = new User();
        user = udbh.selectUserInfo(id);
        if(user==null){
            return false;
        }
        else{
            if(user.userPW.equals(editPassword.getText().toString())){
                Common.userCode=user.userCode;
                return true;
            }
            else{
                return false;
            }
        }
    }
}

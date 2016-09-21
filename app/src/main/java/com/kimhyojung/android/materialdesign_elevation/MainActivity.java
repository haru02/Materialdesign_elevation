package com.kimhyojung.android.materialdesign_elevation;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
    // Api level 21 이상에서 Material Design 설정
    1. res/values/style.xml의 theme를 android:Theme.Material로 변경
    2. AndroidMaifest.xml의 aplication의 theme 속성을 변경된 theme로 지정(Default로 되어 있음)
    3. Activity의 상속 클래스를 AppCompatActivity에서 Activity로 변경

    // Api level 21 미만에서 설정 안됨

*/

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

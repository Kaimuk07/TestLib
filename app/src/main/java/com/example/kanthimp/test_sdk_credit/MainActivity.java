package com.example.kanthimp.test_sdk_credit;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.kanthilibrary.MainTest;
import com.example.libmuk.MainEx;

public class MainActivity extends AppCompatActivity {
 String s = "";
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        s = MainEx.Say();
//        System.out.println(s);
//        Log.i("Say", s);
//        MainEx.sayHello("sss");

        MainEx.Hi(3,2);
        i = MainEx.Math();
        MainEx.sayHello(Integer.toString(i));

        MainTest.SayHi(4,4);
        MainTest.SayHi(2,2);

//        Log.e(TAG, "onCreate: ", );
//        Log.d(TAG, "onCreate: ");
//        Log.w(TAG, "onCreate: ", );
    }
}

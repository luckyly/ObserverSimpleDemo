package com.example.mswang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MeteorologySubject  subject=new MeteorologySubject();

        BJTVObsever bjtvObsever=new BJTVObsever(subject);
        HNTVObserver  hntvObserver=new HNTVObserver(subject);

        subject.setMsg("134567987956532@#%$%");
    }
}
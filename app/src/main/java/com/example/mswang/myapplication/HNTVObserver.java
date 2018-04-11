package com.example.mswang.myapplication;

import android.util.Log;

/**
 * Created by Ms.Wang on 2018/3/28.
 */

public class HNTVObserver implements Observer {

    private Subject subject;
    public HNTVObserver(Subject  subject) {
        this.subject=subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        Log.d("w","HNTV收到的数据："+msg);
    }
}

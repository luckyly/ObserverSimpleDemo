package com.example.mswang.myapplication;

import android.util.Log;

/**
 * Created by Ms.Wang on 2018/3/28.
 */

public class BJTVObsever implements Observer {

    private  Subject  subject;

    public  BJTVObsever(Subject  subject){
        this.subject=subject;
        subject.registerObserver(this);
    }
    @Override
    public void update(String msg) {
        Log.d("w","BJTV收到的数据："+msg);
    }
}
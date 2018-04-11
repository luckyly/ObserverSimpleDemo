package com.example.mswang.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ms.Wang on 2018/3/28.
 */

public class MeteorologySubject implements Subject {

    private String  msg;
    private List  <Observer> observers=new ArrayList();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        if(observers.indexOf(observer)>=0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer  observer:observers) {
                observer.update(msg);
        }
    }

    @Override
    public void setMsg(String msg) {
        this.msg=msg;
        notifyObservers();
    }
}
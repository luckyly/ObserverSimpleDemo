package com.example.mswang.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ms.Wang on 2018/3/28.
 */

public interface Subject {

    public void registerObserver(Observer  observer);

    public void unregisterObserver(Observer  observer);

    public void notifyObservers();

    public void setMsg( String msg);
}
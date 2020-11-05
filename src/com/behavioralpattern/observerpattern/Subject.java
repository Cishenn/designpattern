package com.designpatterndemo.observerpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observerList=new ArrayList<Observer>();

    public void addObserver(Observer o){
        observerList.add(o);
    }

    public abstract void notifyObservers();
}

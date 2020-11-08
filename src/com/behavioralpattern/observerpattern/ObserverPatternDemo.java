package com.behavioralpattern.observerpattern;

public class ObserverPatternDemo {
    public static void main(String[] args){
        Observer alpha=new ObserverAlpha();
        Observer beta=new ObserverBeta();
        Subject realSubject=new RealSubject();
        realSubject.addObserver(alpha);
        realSubject.addObserver(beta);
        realSubject.notifyObservers();
    }
}

package com.behavioralpattern.observerpattern;

public class RealSubject extends Subject {
    @Override
    public void notifyObservers() {

        System.out.println("Real Subject is Changed and:");
        for(Object o:observerList){
            ((Observer)o).response();
        }
    }
}

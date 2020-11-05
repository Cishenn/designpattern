package com.designpatterndemo.observerpattern;

public class ObserverAlpha implements Observer {
    @Override
    public void response() {
        System.out.println("Observer Alpha Response");
    }
}

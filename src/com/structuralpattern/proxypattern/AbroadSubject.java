package com.designpatterndemo.proxypattern;

public class AbroadSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("Abroad Subjects are Requesting...");
    }
}

package com.structuralpattern.proxypattern;

public class Proxy implements Subject {
    AbroadSubject abroadSubject;

    @Override
    public void Request() {
        abroadSubject=new AbroadSubject();
        this.PreRequest();
        abroadSubject.Request();
        this.PostRequest();
    }

    public void PreRequest(){
        System.out.println("PreRequest...");
    }

    public void PostRequest(){
        System.out.println("PostRequest...");
    }
}

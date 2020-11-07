package com.creationalpattern.singleonpattern;

public class Singleon {
    private static Singleon instance=new Singleon();

    private Singleon(){};

    public static Singleon getInstance(){
        return instance;
    }

    public void show(){
        System.out.println("Singleon::show()");
    }
}

package com.behavioralpattern.templatemethod;

public abstract class AbstractClass {
    public void templateMethod(){
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }
    public void specificMethod(){
        System.out.println("Abstract::specificMethod()");
    }
    public abstract void abstractMethod1();
    public abstract void abstractMethod2();
}

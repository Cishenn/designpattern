package com.behavioralpattern.templatemethod;

public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("ConcreteClass::abstractMethod1()");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("ConcreteClass::abstractMethod2()");
    }
}

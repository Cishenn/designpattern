package com.structuralpattern.birdgepattern;

public class ConcreteImplementor implements Implementor {
    @Override
    public void Operation() {
        System.out.println("ConcreteImplementor is Visited");
    }
}

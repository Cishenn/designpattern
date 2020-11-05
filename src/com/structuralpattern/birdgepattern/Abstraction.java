package com.designpatterndemo.birdgepattern;

public abstract class Abstraction {
    protected ConcreteImplementor concreteImplementor;
    Abstraction(ConcreteImplementor concreteImplementor){
        this.concreteImplementor=concreteImplementor;
    }
    public abstract void Operation();
}

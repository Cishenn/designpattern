package com.structuralpattern.birdgepattern;

public class RefinedAbstraction extends Abstraction {
    RefinedAbstraction(ConcreteImplementor concreteImplementor) {
        super(concreteImplementor);
    }

    @Override
    public void Operation() {
        System.out.println("Refined Abstraction is visited");
        concreteImplementor.Operation();
    }
}

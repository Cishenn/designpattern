package com.designpatterndemo.birdgepattern;

public class BridgePatternDemo {
    public static void main(String[] args){
        ConcreteImplementor concreteImplementor=new ConcreteImplementor();
        RefinedAbstraction refinedAbstraction=new RefinedAbstraction(concreteImplementor);
        refinedAbstraction.Operation();
    }
}

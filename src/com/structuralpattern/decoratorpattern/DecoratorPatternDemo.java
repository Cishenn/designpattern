package com.structuralpattern.decoratorpattern;

public class DecoratorPatternDemo {
    public static void main(String[] args){
        Component concreteComponent=new ConcreteComponent();

        System.out.println(concreteComponent.getClass().getName()+"::operation()");
        concreteComponent.operation();

        ConcreteDecorator concreteDecorator=new ConcreteDecorator(concreteComponent);

        System.out.println(concreteDecorator.getClass().getName()+"::operation()");
        concreteDecorator.operation();
    }
}

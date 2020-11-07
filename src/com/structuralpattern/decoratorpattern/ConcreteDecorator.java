package com.structuralpattern.decoratorpattern;

public class ConcreteDecorator extends Decorator {
    ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addFuncDynamic();
    }

    public void addFuncDynamic(){
        System.out.println("Add Functions Dynamically");
    }
}

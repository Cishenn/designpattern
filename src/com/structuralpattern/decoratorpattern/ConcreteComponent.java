package com.designpatterndemo.decoratorpattern;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponet::operation()");
    }
}

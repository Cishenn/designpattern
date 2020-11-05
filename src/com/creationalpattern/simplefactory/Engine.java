package com.designpatterndemo.simplefactory;

public class Engine implements Product {
    @Override
    public void produce() {
        System.out.println("引擎生产出来了");
    }
}

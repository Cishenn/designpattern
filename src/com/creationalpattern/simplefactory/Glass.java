package com.designpatterndemo.simplefactory;

public class Glass implements Product {
    @Override
    public void produce() {
        System.out.println("玻璃生产出来了");
    }
}

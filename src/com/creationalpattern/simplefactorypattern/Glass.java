package com.creationalpattern.simplefactorypattern;

public class Glass implements Product {
    @Override
    public void produce() {
        System.out.println("玻璃生产出来了");
    }
}

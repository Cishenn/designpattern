package com.creationalpattern.simplefactorypattern;

public class Tire implements Product {
    @Override
    public void produce() {
        System.out.println("轮胎生产出来了");
    }
}

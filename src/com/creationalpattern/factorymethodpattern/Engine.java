package com.creationalpattern.factorymethodpattern;

public class Engine implements Product {
    @Override
    public void produce() {
        System.out.println("Engine is produced");
    }
}

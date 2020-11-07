package com.creationalpattern.factorymethodpattern;

public class Glass implements Product {
    @Override
    public void produce() {
        System.out.println("Glass is produced");
    }
}

package com.creationalpattern.builderpattern;

public class Director {
    public Product create(Builder builder){
        builder.buildEngine();
        builder.buildGlass();
        builder.buildSeat();
        builder.buildTire();
        return builder.getProduct();
    }
}

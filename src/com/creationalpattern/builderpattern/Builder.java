package com.creationalpattern.builderpattern;

public interface Builder {
    void buildGlass();
    void buildTire();
    void buildEngine();
    void buildSeat();
    Product getProduct();
}

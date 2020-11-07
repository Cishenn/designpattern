package com.creationalpattern.builderpattern;

public class ConcreteBuilder implements Builder {
    private Product product;
    ConcreteBuilder(){
        product=new Product();
    }
    @Override
    public void buildGlass() {
        product.setGlass("明月镜片");

    }

    @Override
    public void buildTire() {
        product.setTire("米其林轮胎");
    }

    @Override
    public void buildEngine() {
        product.setEngine("帝王引擎");
    }

    @Override
    public void buildSeat() {
        product.setSeat("高级皮椅");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

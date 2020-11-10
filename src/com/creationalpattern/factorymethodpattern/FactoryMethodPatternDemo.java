package com.creationalpattern.factorymethodpattern;

public class FactoryMethodPatternDemo {
    public static void main(String[] args){
        MiFactory miFactory=new MiFactory();
        IFactory iFactory=new IFactory();
        Phone iphone=iFactory.produce();
        Phone miphone=miFactory.produce();
        iphone.use();
        miphone.use();
    }
}

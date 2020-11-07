package com.creationalpattern.simplefactorypattern;

public class SimpleFactoryPatternDemo {
    public static void main(String[] args){
        Factory factory=new Factory();
        System.out.println("我要轮胎");
        factory.produce("tire");
        System.out.println("---------------------");
        System.out.println("我要引擎");
        factory.produce("engine");
        System.out.println("---------------------");
        System.out.println("我要玻璃");
        factory.produce("glass");
        System.out.println("---------------------");
        System.out.println("我要机翼");
        factory.produce("aerofoil");
    }
}

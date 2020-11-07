package com.creationalpattern.builderpattern;

public class BuilderPatternDemo {
    public static void main(String[] args){
        Director director=new Director();
        System.out.println(director.create(new ConcreteBuilder()).toString());
    }
}

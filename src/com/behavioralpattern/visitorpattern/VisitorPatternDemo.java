package com.behavioralpattern.visitorpattern;

public class VisitorPatternDemo {
    public static void main(String[] args){
        ObjectStructure objectStructure=new ObjectStructure();
        objectStructure.add(new Paper());
        objectStructure.add(new Copper());

        System.out.println("Refinery: ");
        objectStructure.accept(new Refinery());
        System.out.println("/n----------------------------");
        System.out.println("Paper: ");
        objectStructure.accept(new Mill());

    }
}

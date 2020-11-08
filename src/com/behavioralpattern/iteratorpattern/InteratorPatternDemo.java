package com.behavioralpattern.iteratorpattern;

public class InteratorPatternDemo {
    public static void main(String[] args){
        Aggregate aggregate=new ConcreteAggregate();
        aggregate.add("Tsinghua University");
        aggregate.add("Perking University");
        aggregate.add("Zhejiang University");

        Interator interator=aggregate.getInterator();
        System.out.print("Priority of Graduate University:  ");
        while(interator.hasNext()){
            Object obj=interator.next();
            System.out.print(obj.toString()+"\t");
        }
        System.out.print("\nFirst is ");
        System.out.println(interator.first());
    }
}

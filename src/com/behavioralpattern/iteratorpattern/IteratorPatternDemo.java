package com.behavioralpattern.iteratorpattern;

public class IteratorPatternDemo {
    public static void main(String[] args){
        Aggregate aggregate=new ConcreteAggregate();
        aggregate.add("Tsinghua University");
        aggregate.add("Peking University");
        aggregate.add("Zhejiang University");

        Iterator iterator =aggregate.getInterator();
        System.out.print("Priority of Graduate University:  ");
        while(iterator.hasNext()){
            Object obj= iterator.next();
            System.out.print(obj.toString()+"\t");
        }
        System.out.print("\nFirst is ");
        System.out.println(iterator.first());
    }
}

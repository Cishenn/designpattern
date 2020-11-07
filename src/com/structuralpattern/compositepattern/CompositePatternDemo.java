package com.structuralpattern.compositepattern;

public class CompositePatternDemo {
    public static void main(String[] args){
        Component root=new Composite();
        Component leaf1=new Leaf("Leaf1");
        Component branch=new Composite();
        Component leaf2=new Leaf("Leaf2");
        Component leaf3=new Leaf("Leaf3");
        root.add(leaf1);
        root.add(branch);
        branch.add(leaf2);
        branch.add(leaf3);

        root.operation();
    }
}

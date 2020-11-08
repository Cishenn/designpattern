package com.behavioralpattern.visitorpattern;

public class Copper implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationCopper(){
        System.out.print("Copper");
    }
}

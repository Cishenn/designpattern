package com.behavioralpattern.visitorpattern;

public class Paper implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationPaper(){
        System.out.print("Paper");
    }
}

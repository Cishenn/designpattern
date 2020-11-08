package com.behavioralpattern.visitorpattern;

public interface Visitor {
    public void visit(Paper paper);
    public void visit(Copper copper);
}

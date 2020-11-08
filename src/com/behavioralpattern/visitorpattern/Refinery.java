package com.behavioralpattern.visitorpattern;

public class Refinery implements Visitor {
    @Override
    public void visit(Paper paper) {
        System.out.println("Refinery Visits");
        paper.operationPaper();
    }

    @Override
    public void visit(Copper copper) {
        System.out.println("Refinery Visits");
        copper.operationCopper();
    }
}

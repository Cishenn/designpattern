package com.behavioralpattern.visitorpattern;

public class Mill implements Visitor {
    @Override
    public void visit(Paper paper) {
        System.out.println("Mill Visits");
        paper.operationPaper();
    }

    @Override
    public void visit(Copper copper) {
        System.out.println("Mill Visits");
        copper.operationCopper();
    }
}

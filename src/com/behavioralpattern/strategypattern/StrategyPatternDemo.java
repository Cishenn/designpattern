package com.designpatterndemo.strategypattern;

public class StrategyPatternDemo {
    public static void main(String[] args){
        Context context=new Context();
        context.setStrategy(new StrategyAlpha());
        context.strategyMethod();
        System.out.println("----------Strategy Changed----------");
        context.setStrategy(new StrategyBeta());
        context.strategyMethod();
    }
}

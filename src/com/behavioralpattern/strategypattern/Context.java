package com.designpatterndemo.strategypattern;

public class Context {
    protected Strategy strategy;
    public Strategy getStrategy(){
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod(){
        strategy.strategyMethod();
    }
}

package com.designpatterndemo.statepattern;

public class StatePatternDemo {
    public static void main(String[] args){
        Context context=new Context();
        context.Handle();
        context.Handle();
        context.Handle();
        context.Handle();
    }
}

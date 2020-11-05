package com.designpatterndemo.commandpattern;

public class CommandPatternDemo {
    public static void main(String[] args){
        Command command=new ConcreteCommand();
        Invoker invoker=new Invoker(command);
        System.out.println("Invoker::call()");
        invoker.call();
    }
}

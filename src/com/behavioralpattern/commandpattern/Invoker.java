package com.behavioralpattern.commandpattern;

public class Invoker {
    private Command command;

    Invoker(Command command){
        this.command=command;
    }

    public void call(){
        System.out.println("Invoker::call()");
        command.execute();
    }
}

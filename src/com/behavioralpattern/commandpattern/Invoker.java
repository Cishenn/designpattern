package com.designpatterndemo.commandpattern;

public class Invoker {
    private Command command;

    Invoker(Command command){
        this.command=command;
    }

    public void call(){
        command.execute();
    }
}

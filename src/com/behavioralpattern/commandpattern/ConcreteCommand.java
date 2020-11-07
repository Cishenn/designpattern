package com.behavioralpattern.commandpattern;

public class ConcreteCommand implements Command {
    Receiver receiver;
    ConcreteCommand(){
        receiver=new Receiver();
    }

    public void execute() {
        receiver.action();
        System.out.println("ConcreteCommand::execute()");
    }
}

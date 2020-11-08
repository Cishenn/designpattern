package com.behavioralpattern.commandpattern;

public class ConcreteCommand implements Command {
    Receiver receiver;
    ConcreteCommand(){
        receiver=new Receiver();
    }

    public void execute() {
        System.out.println("ConcreteCommand::execute()");
        receiver.action();
    }
}

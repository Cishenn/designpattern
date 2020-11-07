package com.behavioralpattern.mediatorpattern;

public abstract class Colleague {
    protected Mediator mediator;
    Colleague(Mediator mediator){
        this.mediator=mediator;
    }
    public abstract void setMediator(Mediator mediator);
    public abstract void send();
    public abstract void receive();
}

package com.behavioralpattern.mediatorpattern;

public class ColleagueAlpha extends Colleague {
    ColleagueAlpha(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }

    @Override
    public void send() {
        System.out.println("Colleague Alpha Send()");
        mediator.relay(this);
    }

    @Override
    public void receive() {
        System.out.println("Colleague Alpha Receive()");
    }
}

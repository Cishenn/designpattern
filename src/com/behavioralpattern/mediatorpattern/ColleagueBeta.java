package com.behavioralpattern.mediatorpattern;

import java.time.Year;

public class ColleagueBeta extends Colleague {
    ColleagueBeta(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }

    @Override
    public void send() {
        System.out.println("Colleague Beta Send()");
        this.mediator.relay(this);
    }

    @Override
    public void receive() {
        System.out.println("Colleague Beta Receive()");
    }
}

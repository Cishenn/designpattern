package com.behavioralpattern.mediatorpattern;

public class MediatorPatternDemo {
    public static void main(String[] args){
        Mediator mediator=new ConcreteMediator();
        Colleague alpha=new ColleagueAlpha(mediator);
        Colleague beta=new ColleagueBeta(mediator);
        mediator.register(alpha);
        mediator.register(beta);
        alpha.send();
        System.out.println("--------------------");
        beta.send();
    }
}

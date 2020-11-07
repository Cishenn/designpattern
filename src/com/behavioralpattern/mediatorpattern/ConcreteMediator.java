package com.behavioralpattern.mediatorpattern;

public class ConcreteMediator extends Mediator {
    @Override
    public void register(Colleague colleague) {
        if(!colleagueList.contains(colleague)){
            colleagueList.add(colleague);

        }
    }

    @Override
    public void relay(Colleague colleague) {
        for(Object c:colleagueList){
            if(!c.equals(colleague)){
                ((Colleague)c).receive();
            }
        }
    }
}

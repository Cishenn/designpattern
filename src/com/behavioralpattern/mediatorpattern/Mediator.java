package com.behavioralpattern.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
    protected List<Colleague> colleagueList=new ArrayList<Colleague>();
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague colleague);
}

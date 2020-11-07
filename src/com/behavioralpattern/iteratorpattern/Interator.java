package com.behavioralpattern.iteratorpattern;

public interface Interator {
    public boolean hasNext();
    public Interator next();
    public void addNext(Object o);
}

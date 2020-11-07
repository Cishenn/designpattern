package com.behavioralpattern.visitorpattern;

public interface Element {
    public void accept(Visitor visitor);
}

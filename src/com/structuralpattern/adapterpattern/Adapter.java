package com.structuralpattern.adapterpattern;

public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        SpecificRequest();
    }
}

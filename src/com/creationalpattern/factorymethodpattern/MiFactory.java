package com.creationalpattern.factorymethodpattern;

public class MiFactory {
    public Phone produce(){
        return new MiPhone();
    }
}

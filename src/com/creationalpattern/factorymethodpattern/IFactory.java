package com.creationalpattern.factorymethodpattern;

public class IFactory {
    public Phone produce(){
        return new IPhone();
    }
}

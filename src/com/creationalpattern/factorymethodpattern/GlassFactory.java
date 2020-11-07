package com.creationalpattern.factorymethodpattern;

public class GlassFactory implements CarFactory {
    @Override
    public Product produce() {
        return new Glass();
    }
}

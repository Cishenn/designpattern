package com.creationalpattern.factorymethodpattern;

public class EngineFactory implements CarFactory {
    @Override
    public Product produce() {
        return new Engine();
    }
}

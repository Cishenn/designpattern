package com.creationalpattern.abstractfactory;

// 抽象工厂
public interface Factory{
    public Phone getPhone();
    public Pad getPad();
    String getDescription();
}
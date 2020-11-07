package com.creationalpattern.abstractfactory;

// 苹果工厂
public class iFactory implements Factory{
    @Override
    public Phone getPhone(){
        return new iPhone();
    }

    @Override
    public Pad getPad(){
        return new iPad();
    }

    @Override
    public String getDescription() {
        return "苹果工厂";
    }
}

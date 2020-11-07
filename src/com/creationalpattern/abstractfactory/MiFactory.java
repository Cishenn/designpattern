package com.creationalpattern.abstractfactory;

//小米工厂
public class MiFactory implements Factory{
    @Override
    public Phone getPhone(){
        return new MiPhone();
    }

    @Override
    public Pad getPad(){
        return new MiPad();
    }

    @Override
    public String getDescription() {
        return "小米工厂";
    }
}
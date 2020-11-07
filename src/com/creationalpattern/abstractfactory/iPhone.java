package com.creationalpattern.abstractfactory;

// 苹果手机
public class iPhone implements Phone{
    @Override
    public void call(){
        System.out.println("iPhone calls");
    }

    @Override
    public String getDescription() {
        return "iPhone";
    }
}

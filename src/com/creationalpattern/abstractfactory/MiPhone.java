package com.designpatterndemo.abstractfactory;

// 小米手机
public class MiPhone implements Phone{
    @Override
    public void call(){
        System.out.println("MiPhone calls");
    }

    @Override
    public String getDescription() {
        return "小米手机";
    }
}

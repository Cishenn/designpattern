package com.designpatterndemo.abstractfactory;

// 苹果平板
public class iPad implements Pad{
    @Override
    public void ppt(){
        System.out.println("IPad displays PPT");
    }

    @Override
    public String getDescription() {
        return "iPad";
    }
}

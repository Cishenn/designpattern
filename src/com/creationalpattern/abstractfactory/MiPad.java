package com.designpatterndemo.abstractfactory;

// 小米平板
public class MiPad implements Pad{
    @Override
    public void ppt(){
        System.out.println("MiPad displays PPT");
    }

    @Override
    public String getDescription() {
        return "小米平板";
    }
}

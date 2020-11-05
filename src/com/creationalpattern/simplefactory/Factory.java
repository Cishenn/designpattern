package com.designpatterndemo.simplefactory;

import com.designpatterndemo.proxypattern.Proxy;

public class Factory {
    public void produce(String s){
        Product p=null;
        switch (s){
            case "tire":
                p=new Tire();
                p.produce();
                break;
            case "engine":
                p=new Engine();
                p.produce();
                break;
            case "glass":
                p=new Glass();
                p.produce();
                break;
            default:
                System.out.println("无法生产此类产品");
        }

    }
}

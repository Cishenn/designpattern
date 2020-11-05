package com.designpatterndemo.abstractfactory;

import java.util.Arrays;
import java.util.List;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        List<Factory> factories = Arrays.asList(
                new iFactory(),
                new MiFactory()
        );
        factories.forEach(factory -> {
            System.out.println(String.format("从 %s 生产出的是 %s 和 %s",
                    factory.getDescription(), factory.getPhone().getDescription(), factory.getPad().getDescription()));
        });
    }
}

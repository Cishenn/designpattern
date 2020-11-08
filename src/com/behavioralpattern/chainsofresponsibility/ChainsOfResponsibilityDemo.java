package com.behavioralpattern.chainsofresponsibility;

public class ChainsOfResponsibilityDemo {
    public static void main(String[] args){
        Handler deputyPresident=new DeputyPresident();
        Handler president=new President();
        Handler chairman=new Chairman();
        deputyPresident.setNext(president);
        president.setNext(chairman);

        System.out.println("Low Level");
        deputyPresident.HandleRequest("DeputyPresident");
        System.out.println("-------------------");
        System.out.println("Medium Level");
        deputyPresident.HandleRequest("President");
        System.out.println("-------------------");
        System.out.println("High Level");
        chairman.HandleRequest("Chairman");
        System.out.println("-------------------");
        System.out.println("GOD Level");
        deputyPresident.HandleRequest("God");
    }
}

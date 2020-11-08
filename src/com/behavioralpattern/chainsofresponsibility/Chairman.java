package com.behavioralpattern.chainsofresponsibility;

public class Chairman extends Handler {
    @Override
    public void HandleRequest(String request) {
        if(request.equals("Chairman")){
            System.out.println("Chairman Handle");
        }else{
            if(this.next!=null){
                this.getNext().HandleRequest(request);
            }else {
                System.out.println("No One Handle");

            }

        }
    }
}

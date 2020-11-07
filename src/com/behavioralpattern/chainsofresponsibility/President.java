package com.behavioralpattern.chainsofresponsibility;

public class President extends Handler {
    @Override
    public void HandleRequest(String request) {
        if(request.equals("President")){
            System.out.println("President Handle");
        }else{
            if(this.next!=null){
                this.getNext().HandleRequest(request);
            }else{
                System.out.println("No One Handle");
            }

        }
    }
}

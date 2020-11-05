package com.designpatterndemo.chainsofresponsibility;

public class DeputyPresident extends Handler {
    @Override
    public void HandleRequest(String request) {
        if(request.equals("DeputyPresident")){
            System.out.println("Deputy President Handle");
        }else{
            if(this.next!=null){
                this.getNext().HandleRequest(request);
            }else{
                System.out.println("No One Handle");
            }
        }
    }
}

package com.designpatterndemo.chainsofresponsibility;

public abstract class Handler {
    protected Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void HandleRequest(String request);
}

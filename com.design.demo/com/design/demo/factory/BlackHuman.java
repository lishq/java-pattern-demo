package com.design.demo.factory;

public class BlackHuman implements Human {

    @Override
    public void laught() {
        System.out.println("black laught...");
    }

    @Override
    public void cry() {
        System.out.println("black cry...");
    }

    @Override
    public void talk() {
        System.out.println("black talk...");
    }
}

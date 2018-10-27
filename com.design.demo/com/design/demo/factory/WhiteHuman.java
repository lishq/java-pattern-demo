package com.design.demo.factory;

public class WhiteHuman implements Human {

    @Override
    public void laught() {
        System.out.println("white laught...");
    }

    @Override
    public void cry() {
        System.out.println("white cry...");
    }

    @Override
    public void talk() {
        System.out.println("white talk...");
    }
}

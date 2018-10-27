package com.design.demo.factoryAbstract;

public abstract class AbstractYellowHuman implements Human{

    @Override
    public void laught() {
        System.out.println("yellow laught...");
    }

    @Override
    public void cry() {
        System.out.println("yellow cry...");
    }

    @Override
    public void talk() {
        System.out.println("yellow talk...");
    }

}

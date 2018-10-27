package com.design.demo.strategy;

public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    //使用妙计，获得胜利
    public void operate() {
        this.strategy.operate();
    }
}

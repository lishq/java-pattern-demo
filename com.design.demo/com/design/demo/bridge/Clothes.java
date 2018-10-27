package com.design.demo.bridge;

public class Clothes extends Product {

    @Override
    public void beProduced() {
        System.out.println("clothes produced ...");
    }

    @Override
    public void beSelled() {
        System.out.println("clothes selled ...");
    }
}

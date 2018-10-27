package com.design.demo.bridge;

public abstract class Corp {

    //这个公司拥有的产品是什么
    private Product product;

    //初始化公司
    public Corp(Product product){
        this.product = product;
    }

    //公司赚钱的方式
    public void makeMoney() {
        this.product.beProduced();
        this.product.beSelled();
    }
}

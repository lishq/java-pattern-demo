package com.design.demo.multition;

import org.junit.Test;

public class Minister {

    @Test
    public void test() {

        int ministerNum = 10;

        for(int i=0; i<ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.println("参拜的大臣是："+i);
            emperor.emperorInfo();
        }
    }
}

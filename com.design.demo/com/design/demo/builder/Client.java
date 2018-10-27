package com.design.demo.builder;

import org.junit.Test;

/**
 * TODO 设计模式之建造者模式
 * <p>背景：如果客户不仅要制造出宝马， 奔驰的车型。还要动态的设置他们去做什么。
 * 现有的动作（启动，引擎声，鸣笛，停止）。客户可以定义宝马有启动，停止。
 * 而奔驰有启动，引擎声，停止。这时该如何来做？
 * <a href="{@docRoot}/../***</a>.
 */
public class Client {

    @Test
    public void test() {
        Director director = new Director();
        director.getCar1AModel().run();
        System.out.println();
        director.getCar1BModel().run();
        System.out.println();
        director.getCar2AModel().run();
        System.out.println();
        director.getCar2BModel().run();
    }
}

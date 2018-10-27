package com.design.demo.adapter;

import org.junit.Test;

/**
 * TODO 设计模式之抽象适配器模式
 * <p>背景：我们系统中的用户设计是IUserInfo(name,mobile,address)，
 * 而这时要接入别的项目的用户数据。要做到的程度：既能查询到我们的数据，
 * 也能查询到别的系统的用户数据。
 *
 * 而这时，对方系统用户设置了基础信息，家庭信息。
 *
 * 数据结构不一致，我们做个适配器解决之。
 */
public class Client {

    @Test
    public void test() {
        System.out.println("inner system data...");
        //before adapter
        IUserInfo userInfo = new UserInfo();
        userInfo.getName();
        userInfo.getMobile();
        userInfo.getAddress();

        System.out.println();
        System.out.println("outer system data...");
        //after adapter
        userInfo = new UserAdapter();
        userInfo.getName();
        userInfo.getMobile();
        userInfo.getAddress();
    }
}

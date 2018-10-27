package com.design.demo.adapter;

public class UserInfo implements IUserInfo {

    @Override
    public String getName() {
        System.out.println("部门系统李四");
        return null;
    }

    @Override
    public String getMobile() {
        System.out.println("1111");
        return null;
    }

    @Override
    public String getAddress() {
        System.out.println("城北外");
        return null;
    }
}

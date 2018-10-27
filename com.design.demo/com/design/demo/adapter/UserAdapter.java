package com.design.demo.adapter;

import java.util.Map;

public class UserAdapter extends OuterUser implements IUserInfo {

    private Map<String,String> baseInfo = super.getBaseInfo();

    private Map<String,String> homeInfo = super.getHomeInfo();

    @Override
    public String getName() {
        System.out.println(baseInfo.get("name"));
        return null;
    }

    @Override
    public String getMobile() {
        System.out.println(baseInfo.get("mobile"));
        return null;
    }

    @Override
    public String getAddress() {
        System.out.println(homeInfo.get("address"));
        return null;
    }
}

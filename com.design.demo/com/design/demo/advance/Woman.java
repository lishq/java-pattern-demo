package com.design.demo.advance;

public class Woman implements IWoman {

    //级别，1未婚，2已婚，3丧夫
    private int type = 0;

    //请求内容
    private String request = "";

    public Woman(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String getRequest() {
        return request;
    }
}

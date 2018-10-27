package com.design.demo.observer;

import java.util.Observable;

public class HanFeizi extends Observable {

    public void haveBreakFast() {
        System.out.println("韩非子开始吃饭...");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    public void haveFun() {
        System.out.println("韩非子开始娱乐...");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }

}

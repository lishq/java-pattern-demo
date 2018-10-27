package com.design.demo.observer;

import java.util.Observable;

public class Lisi implements Watcher{

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯：观察到韩非子在活动，开始向老板报告");
        this.reportToKing(arg.toString());
        System.out.println("李斯：汇报完毕，秦始皇赏给2个萝卜。\n");
    }

    public void reportToKing(String message) {
        System.out.println("李斯：报告秦始皇，韩非子有活动了->"+message);
    }
}

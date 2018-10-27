package com.design.demo.observer;

import com.design.demo.util.ClassUtils;
import org.junit.Test;

import java.util.List;
import java.util.Observer;
/**
 * TODO 设计模式之观察者模式
 * <p>背景：李斯,张斯是不同国家的当权者，需要监控韩国韩非子的一举一动。
 * 韩非子所有的动作都要给李斯，张斯发送报告。然后再报告给各自的老大。
 * <a href="{@docRoot}/../***</a>.
 */
public class Client {

    @Test
    public void test() throws Exception  {
        //直接new出观察对象
        //call();

        //自动查找所有实现自定义接口Watcher的类，并将之new出。
        callByInterface();
    }

    public static void call() {
        HanFeizi hanFeiZi = new HanFeizi();

        Observer lisi = new Lisi();
        Observer zhangsi = new ZhangSi();
        hanFeiZi.addObserver(zhangsi);
        hanFeiZi.addObserver(lisi);

        hanFeiZi.haveBreakFast();
        hanFeiZi.haveFun();

    }

    public static void callByInterface() throws Exception {
        HanFeizi hanFeiZi = new HanFeizi();

        List<Class> watchers = ClassUtils.getAllClassByInterface(Watcher.class);
        if(watchers != null && watchers.size() > 0) {
            for(Class<? extends Watcher> watcher : watchers) {
                Watcher instance = (Watcher) Class.forName(watcher.getName()).newInstance();
                hanFeiZi.addObserver(instance);
            }
        }

        hanFeiZi.haveBreakFast();
        hanFeiZi.haveFun();

    }
}

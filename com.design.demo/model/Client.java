package model;

import org.junit.Test;

/**
 * TODO 设计模式之抽象模板模式
 * <p>背景：有一个车辆模型，然后需要录入各种不同类型的车。
 * 写一个抽象类，CarModel
 * 剩下的所有具体的车型都将继承CarModel.
 */
public class Client {

    @Test
    public void test() {

        CarModel car = new CarH1();
        car.run();
        System.out.println();
        car = new CarH2();
        car.run();
    }
}

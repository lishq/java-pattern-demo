package com.design.demo.mediator;

import org.junit.Test;

/**
 * TODO 设计模式之中介模式
 * <p>背景：当有多个对象之间相互调用时，生成一个中介来协调处理各个类。
 * 举例：销售，采购，库存。销售时，如果有库存则销售，没库存则采购在销售。
 *
 * 抽象中介者（Mediator）角色：抽象中介者角色定义统一的接口用于各同事角色之间的通信。
 *
 * 具体中介者（Concrete Mediator）角色：具体中介者角色通过协调各同事角色实现协作行为，
 * 因此它必须依赖于各个同事角色。
 *
 * 同事（Colleague）角色：每一个同事角色都知道中介者角色，而且与其他的同事角色通信的时候，
 * 一定要通过中介者角色协作。每个同事类的行为分为两种：一种是同事本身的行为，比如改变对象
 * 本身的状态，处理自己的行为等等，这种方法叫做自发行为(Self-Method)，与其他的同事类或
 * 中介者没有任何的依赖；第二种是是必须依赖中介者才能完成的行为，叫做依赖方法（Dep-Method）。
 * <a href="{@docRoot}/../***</a>.
 */
public class Client {

    @Test
    public void test() {

        // 创建中介
        AbstractMediator mediator = new Mediator();
        // 让每个同事都认识中介
        AbstractColleague colleagueSale = new Sale(mediator);

        AbstractColleague colleaguePurshase = new Purshase(mediator);

        AbstractColleague colleagueStock = new Stock(mediator);

        System.out.println();
        System.out.println("begin buy...");
        ((Sale) colleagueSale).sell(1000);

        System.out.println();
        System.out.println("begin sell...");
        ((Purshase) colleaguePurshase).buy(1000);

        System.out.println();
        System.out.println("begin stock...");
        ((Stock) colleagueStock).clearStock();
    }
}

package com.design.demo.strategy;

import org.junit.Test;

/**
 * TODO 设计模式之策略模式
 * <p>背景：刘备要到江东娶老婆了，走之前诸葛亮给赵云（伴郎）三个锦囊妙计，
 * 说是按天机拆开解决棘手问题，还真是解决了大问题，摘到最后赔了夫人又折兵，
 * 那我们先看下场景有是什么样子的。
 *
 * 先说下场景中的要素：三个锦囊，一个赵云，妙计是小亮同志给的，妙计是安放
 * 在锦囊中的，俗称锦囊妙计，赵云是一个干活的人，从锦囊中取出妙计，执行，
 * 然后获胜。
 *
 * <p>总结：就这三招搞得周郎赔了夫人又折兵，这就是策略模式。高内聚低耦合的特点就
 * 表现出来了，还有一个就是扩展性，也就是OCP原则，策略类可以一直加下去，
 * 只要修改Context.java就好了。
 */
public class Zhaoyun {

    @Test
    public void test() {

        Context context;
        System.out.println("-----------刚刚到吴国的时候拆第一个-------------");
        context = new Context(new BackDoor());
        //拿到妙计
        context.operate();
        //拆开执行
        System.out.println("\n\n");

        System.out.println("-----------刘备乐不思蜀了，拆第二个了-------------");
        context = new Context(new GiveGreenLight());
        //拿到妙计
        context.operate();
        //拆开执行
        System.out.println("\n\n");

        System.out.println("-----------孙权的小兵追了，咋办？拆第三个 -------------");
        context = new Context(new BlockEnemy());
        //拿到妙计
        context.operate();
        //拆开执行
        System.out.println("\n\n");
    }
}

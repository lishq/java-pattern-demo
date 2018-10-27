package com.design.demo.bridge;

import org.junit.Test;

/**
 * TODO 设计模式之桥梁模式
 * <p>背景：假如某老板有一房地产公司公司，专门卖房赚钱。
 * 另外最近ipod，衣服等赚钱，老板想开个专门山寨的各种公司。
 * 但是，老板只关注赚钱。具体的生产，销售，老板不管。
 * <a href="{@docRoot}/../***</a>.
 */
public class Client {

    @Test
    public void test() {
        //老板主要业务，房地产公司
        HourceCorp hourseCorp = new HourceCorp(new Hourse());
        hourseCorp.makeMoney();
        System.out.println();

        //山寨公司-卖衣服
        CopyCorp copyCorp = new CopyCorp(new Clothes());
        copyCorp.makeMoney();
        System.out.println();

        //山寨公司-卖ipod
        copyCorp = new CopyCorp(new Ipod());
        copyCorp.makeMoney();
    }
}

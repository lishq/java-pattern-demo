package com.design.demo.agency;

import org.junit.Test;

/**
 * TODO 设计模式之代理模式
 * <p>介绍：什么是代理模式？我很忙，忙得没空理你，那你要找就先找我的
 * 代理人吧，那代理人总要知道被代理人能做不能做哪些事吧，那就是两个人
 * 具备同一个接口，代理人虽然不能干活，但是被代理的人能干活啊。
 * 比如西门庆，潘金莲，那潘金莲不好意思答复啊，咋办，找王婆做个代理，
 */
public class XiMenQing {

    @Test
    public void test() {

        WangPo wangPo;

        //把王婆叫出来
        wangPo = new WangPo(new PanJinLian());

        //然后西门庆就说，我要和潘金莲聊天，然后王婆就安排了西门庆出场:
        wangPo.makeEyesWithMan(); //看到没，虽然表面上时王婆在聊天，实际上是潘金莲
        wangPo.makeTalk();

        //西门庆要换个妹子，换成贾氏
        wangPo = new WangPo(new JiaShi()); //让王婆作为贾氏的代理人
        wangPo.makeEyesWithMan();
        wangPo.makeTalk();
    }
}

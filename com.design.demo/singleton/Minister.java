package singleton;

import org.junit.Test;

/**
 * TODO 设计模式之单例模式
 * <p>背景：单例就是单一、独苗的意思，那什么是独一份呢？你的思维是独一份，除此之外还有什么不能山寨的呢？
 *
 * 我们举个比较难复制的对象：皇帝中国的历史上很少出现两个皇帝并存的时期，是有，但不多，
 * 那我们就认为皇帝是个单例模式，在这个场景中，有皇帝，有大臣，大臣是天天要上朝参见皇帝的，
 * 今天参拜的皇帝应该和昨天前天的一样，大臣磕完头，抬头一看，嗨，
 * 还是昨天那个皇帝，单例模式。
 */
public class Minister {

    @Test
    public void test() {
        Emperor emperor1 = Emperor.getInstance();
        emperor1.info();

        Emperor emperor2 = Emperor.getInstance();
        emperor2.info();

        Emperor emperor3 = Emperor.getInstance();
        emperor3.info();

    }
}

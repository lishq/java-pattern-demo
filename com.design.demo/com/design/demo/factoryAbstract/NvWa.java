package com.design.demo.factoryAbstract;

import org.junit.Test;

/**
 * TODO 设计模式之抽象工厂模式
 * <p>背景： 好了，我们继续工厂模式，上一节讲到女娲造人，人是造出来了，世界时热闹了，
 * 可是低头一看，都是清一色的类型，缺少关爱、仇恨、喜怒哀乐等情绪，人类的生命太平淡了，
 * 女娲一想，猛然一拍脑袋，
 * Shit！忘记给人类定义性别了，那怎么办？抹掉重来，然后就把人类重新洗牌，准备重新开始制造人类。
 *
 * 由于先前的工作已经花费了很大的精力做为铺垫，也不想从头开始了，那先说人类（Product 产品类）
 * 怎么改吧，好，有了，给每个人类都加一个性别，然后再重新制造，这个问题解决了，那八卦炉怎么办？
 * 只有一个呀，要么生产出全都是男性，要不都是女性，那不行呀，有了，把已经有了一条生产线——八卦炉
 * （工厂模式中的 Concrete Factory）拆开，于是女娲就使用了“八卦拷贝术”，把原先的八卦炉一个
 * 变两个，并且略加修改，就成了女性八卦炉（只生产女性，一个具体工厂的实现类）和男性八卦炉（
 * 只生产男性，又一个具体工厂的实现类）
 */
public class NvWa {

    @Test
    public void test() {

        //男性生产线
        HumanFactory maleHumanFactory = new MaleHumanFactory();

        //女性生产线
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        Human maleYellowHuman = maleHumanFactory.createYellowHuman();

        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        maleYellowHuman.laught();
        maleYellowHuman.cry();
        maleYellowHuman.talk();
        maleYellowHuman.sex();

        System.out.println();
        femaleYellowHuman.laught();
        femaleYellowHuman.cry();
        femaleYellowHuman.talk();
        femaleYellowHuman.sex();
    }
}

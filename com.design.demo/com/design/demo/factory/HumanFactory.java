package com.design.demo.factory;

import com.design.demo.util.ClassUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class HumanFactory {

    private static Map<String, Human> humanMap = new HashMap<String, Human>(32);

    public static Human createHuman(Class<? extends Human> c) {
        Human human = null;
        try {
            /**
             * 延迟始化(Lazy initialization)，什么是延迟始化呢？一个对象初始化完毕后就不释放，
             * 等到再次用得到就不用再次初始化了，直接从内存中拿到就可以了
             *
             * 这个在类初始化很消耗资源的情况比较实用，比如你要连接硬件，
             * 或者是为了初始化一个类需要准备比较多条件（参数），
             * 通过这种方式可以很好的减少项目的复杂程度。
             */
//            human = (Human)Class.forName(c.getName()).newInstance();
            if(humanMap.get(c.getSimpleName()) != null) {
                human = humanMap.get(c.getSimpleName());
            }else {
                human = (Human)Class.forName(c.getName()).newInstance();
                humanMap.put(c.getSimpleName(), human);
            }
        } catch (Exception e) {

            System.out.println("造人出现问题");
        }

        return human;

    }

    public static Human createHuman() {

        List<Class> createHumanList =
                ClassUtils.getAllClassByInterface(Human.class); //定义了多少人类

        Human human = null;

        Random random = new Random();
        int rand = random.nextInt(createHumanList.size());

        human = HumanFactory.createHuman((Class<? extends Human>
                ) createHumanList.get(rand));

        return human;

    }
}

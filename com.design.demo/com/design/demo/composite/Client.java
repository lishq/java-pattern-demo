package com.design.demo.composite;

import org.junit.Test;

import java.util.List;

/**
 * TODO 设计模式之组合模式
 * <p>背景：迭代器模式pass，因为迭代器模式是在jdk1.2出现Iterator时的模式。
 * 对于现在用List,Map遍历即可搞定。
 *
 * 一个组织架构图，上至CEO，下至普通开发人员，有这样的一个树结构，我们用组合模式来实现
 * <a href="{@docRoot}/../***</a>.
 */
public class Client {

    @Test
    public void test() {
        Branch ceo = compositeTree();

        System.out.println(ceo.getInfo());

        System.out.println(getTreeInfo(ceo));
    }

    public static Branch compositeTree() {
        Branch ceo = new Branch("张三", "CEO", 100000.0);

        Branch leader1 = new Branch("部门经理A", "部门经理", 61000.0);

        Branch leader2 = new Branch("部门经理B", "部门经理", 62000.0);

        Branch leader3 = new Branch("部门经理C", "部门经理", 63000.0);

        Leaf leaf1 = new Leaf("普通开发A", "普通开发", 11000.0);

        Leaf leaf2 = new Leaf("普通开发B", "普通开发", 12000.0);

        Leaf leaf3 = new Leaf("普通开发C", "普通开发", 13000.0);

        ceo.addSubOrdinate(leader1);
        ceo.addSubOrdinate(leader2);
        ceo.addSubOrdinate(leader3);

        leader1.addSubOrdinate(leaf1);
        leader1.addSubOrdinate(leaf2);
        leader2.addSubOrdinate(leaf3);

        return ceo;
    }

    public static String getTreeInfo(Branch branch) {
        List<Crop> subordinateList = branch.getSubOrdinate();

        String info = "";

        for(Crop crop : subordinateList) {
            if(crop instanceof Leaf) {
                info += crop.getInfo() + "\n";
            }else {
                info += crop.getInfo() + "\n" + getTreeInfo((Branch)crop);
            }
        }

        return info;
    }
}

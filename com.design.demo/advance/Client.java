package advance;

import org.junit.Test;

import java.util.Random;

/**
 * TODO 设计模式之责任链模式
 * <p>背景：古代之三从四德，未婚从父，已婚从夫，丧父从子。女子如果想去逛街，
 * 先得请示父亲，如果父亲不在则请求丈夫，如果丈夫不在则请求儿子。抽象一下表达。
 *
 * 对象拆分：女人（女子），男人（父亲，丈夫，儿子），动作拆分：
 * 男子批准女子的逛街请求。男子对象拥有该动作。（基于，谁拥有动作，方法则属于那个对象）
 */
public class Client {

    @Test
    public void test(){
        Handler father = new Father(1);
        Handler husband = new Husband(2);
        Handler son = new Son(3);

        father.setNext(husband);
        husband.setNext(son);

        for(int i=0; i<5; i++) {
            int a = new Random().nextInt(3) + 1;
            Woman woman = new Woman(a, "我想去逛街");
            father.handleMessage(woman);
        }
    }
}

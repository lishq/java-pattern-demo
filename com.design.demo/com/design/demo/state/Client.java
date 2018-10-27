package com.design.demo.state;

import org.junit.Test;

/**
 * TODO 设计模式之状态模式
 * <p>背景：项目中会遇到各种各样的状态流转，
 * 比如，电梯的“打开”，“关闭”，“运行”，“停止”状态。
 * 同一时刻只会有一个状态。例如，打开状态，可以打开，关闭，
 * 而不能运行和停止。如果正常的写法，将会写很多的switch来判断。
 * 我们用状态模式来实现一下。
 */
public class Client {

    @Test
    public void test() {

        //设置状态调用的上下文
        Context context = new Context();
        //设置起始状态是关闭状态
        context.setLiftState(new CloseState());

        context.open();
        context.close();
        context.run();
        context.stop();
        //这个不应该被执行，因为停止状态不能到达运行状态，得先执行close
        context.run();
    }
}

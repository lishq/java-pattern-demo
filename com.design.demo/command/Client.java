package command;

import org.junit.Test;

/**
 * TODO 设计模式之命令模式
 * <p>背景：正常做一个项目，有客户，需求组，美工组，开发组。
 * 然后项目经理负责统筹整个项目的进度和安排。
 *
 * 这时，客户找到项目经理说任何一个事情，增加需求，删除需求，增加页面，
 * 修改页面等等。这样就造就了命令模式
 * <a href="{@docRoot}/../***</a>.
 */
public class Client {

    @Test
    public void test() {
        Invoker invoker = new Invoker();
        invoker.setCommand(new RequireAddCommand());
        invoker.action();
        System.out.println();

        invoker.setCommand(new PageDeleteCommand());
        invoker.action();
    }
}

package com.design.demo.interpreter;

import org.junit.Test;

import java.util.HashMap;

/**
 * TODO 设计模式之解释器模式
 * <p>背景：当我们需要计算a+b-c时，我们需要第一步，定义这个表达式，
 * 赋予其逻辑。然后将变量填充，得出结果。我们现在用程序来理解它。
 * <a href="{@docRoot}/../***</a>.
 */
public class Client {

    @Test
    public void test() {
        String expStr = "a+b-c";
        HashMap<String,Integer> var = new HashMap<String, Integer>();
        var.put("a", 100);
        var.put("b", 5);
        var.put("c", 10);

        Calculator cal = new Calculator(expStr);
        System.out.println(cal.run(var));
    }
}

package com.design.demo.prototype;

import org.junit.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * TODO 设计模式之原型模式
 * <p>背景：当我们发送邮件的时候需要模板来设置一些固定的东东。
 * 用到Template。然而，我们在发送时，一个Mail对象被发送多次，
 * 为了提升速度需要用到多线程来处理，这时就会有对象数据不安全。
 * 这时用到了Cloneable接口来解决这个问题。
 */
public class Client {

    @Test
    public void test() {

        Mail src = new Mail(new AdvTemplate());

        int count = 6;

        for(int i=0; i<count; i++) {
            //浅clone，解决多线程访问不安全的问题
            Mail mail = src.clone();
            mail.setReceiver(getRandomString(9));
            mail.setTail(" to " + mail.getReceiver());
            sendMail(mail);
        }
    }

    private static char[] msg = new char['z'-'a' + 1];

    static {
        //防止拼错26个字母
        for(int i='a'; i<='z'; i++) {
            msg[i - 'a'] = (char) i;
        }
    }

    public static void sendMail(Mail mail) {

        System.out.println("send to " + mail.getReceiver() + "@qq.com\t" + mail.getSubject() + "\t" +
                mail.getContent() + "\t" + mail.getTail());
    }

    public static String getRandomString(int number) {
        Random random = new Random();
        StringBuffer result = new StringBuffer();
        for(int i=0; i<number; i++) {
            result.append(msg[random.nextInt(msg.length)]);
        }

        return result.toString();
    }
}

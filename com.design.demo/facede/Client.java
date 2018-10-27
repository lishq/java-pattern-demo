package facede;

import org.junit.Test;

/**
 * TODO 设计模式之门面模式
 * <p>背景：大家都是高智商的人，都写过纸质的信件吧，比如给女朋友写情书什么的，
 * 写信的过程大家都还记得吧，先写信的内容，然后写信封，然后把信放到信封中，封好，
 * 投递到信箱中进行邮递，这个过程还是比较简单的，虽然简单，这四个步骤都是要跑的呀，
 * 信多了还是麻烦，比如到了情人节，为了大海捞针，给十个女孩子发情书，都要这样跑一遍，
 * 你不要累死，更别说你要发个广告信啥的，一下子发 1 千万封邮件，那不就完蛋了？
 * 那怎么办呢？还好，现在邮局开发了一个新业务，你只要把信件的必要信息高速我，我给你发，
 * 我来做这四个过，你就不要管了，只要把信件交给我就成了。
 *
 * 在这中环境下，最累的是写信的人，为了发送一封信出去要有四个步骤，
 * 而且这四个步骤还不能颠倒，你不可能没写信就把信放到信封吧，写信的人要知道这四个步骤，
 * 而且还要知道这四个步骤的顺序，恐怖吧，我们先看看这个过程如何表现出来的。
 */
public class Client {

    @Test
    public void test() {
        ModenPostOffice mpo = new ModenPostOffice();
        mpo.sendLetter("hello world.", "lishq@github.com");
    }
}
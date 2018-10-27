package facede;

public class LetterProcessImpl implements LetterProcess {

    @Override
    //写信
    public void writeContent(String content) {
        System.out.println("write content :"+content);
    }

    @Override
    //在信封上填写必要的信息
    public void fileEnvelope(String address) {
        System.out.println("write envelope :"+address);
    }

    @Override
    //把信放到信封中，并封好
    public void letter2Envelope() {
        System.out.println("put letter into envelope...");
    }

    @Override
    //塞到邮箱中，邮递
    public void sendLetter() {
        System.out.println("send letter ...");
    }
}

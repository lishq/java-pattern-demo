package facede;

public interface LetterProcess {

    //首先要写信的内容
    public void writeContent(String content);

    //其次写信封
    public void fileEnvelope(String address);

    //把信放到信封里
    public void letter2Envelope();

    //然后邮递
    public void sendLetter();
}

package advance;

public class Son extends Handler {

    public Son(int type) {
        super(type);
    }

    @Override
    public void response(Woman woman) {
        System.out.println("请求得到儿子的同意");
        System.out.println(woman.getRequest());
        System.out.println("儿子：已同意\n");
    }
}

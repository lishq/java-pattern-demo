package advance;

public class Father extends Handler {

    public Father(int type) {
        super(type);
    }

    @Override
    public void response(Woman woman) {
        System.out.println("请求得到父亲的同意");
        System.out.println(woman.getRequest());
        System.out.println("父亲：已同意\n");
    }
}

package state;

/**
 * 状态的抽象
 */
public abstract class LiftState {

    //上下文，控制状态的调用
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //打开电梯
    public abstract void open();

    //关闭电梯
    public abstract void close();

    //运行电梯
    public abstract void run();

    //停止电梯
    public abstract void stop();

}

package com.design.demo.state;

/**
 * 调用各个状态的上下文
 */
public class Context{

    //存储各个状态
    public static final OpenState openState = new OpenState();

    public static final CloseState closeState = new CloseState();

    public static final RunState runState = new RunState();

    public static final StopState stopState = new StopState();

    //保存当前的状态值
    public LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}

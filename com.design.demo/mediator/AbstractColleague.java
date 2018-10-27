package mediator;

/**
 * 抽象同事
 */
public abstract class AbstractColleague {

    //依赖中介
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}

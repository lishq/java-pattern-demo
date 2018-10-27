package mediator;

/**
 * 抽象中介
 */
public abstract class AbstractMediator {

    protected Stock stock;

    protected Purshase purshase;

    protected Sale sale;

    public AbstractMediator() {
        this.stock = new Stock(this);
        this.purshase = new Purshase(this);
        this.sale = new Sale(this);
    }

    public abstract void execute(String str, Object...objects);
}

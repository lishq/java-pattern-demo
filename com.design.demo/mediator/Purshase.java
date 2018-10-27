package mediator;

public class Purshase extends AbstractColleague {

    public Purshase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buy(int number) {
        this.mediator.execute("purchase.buy", number);
    }

    public void refuseBuy() {
        System.out.println("refuse buy");
    }
}

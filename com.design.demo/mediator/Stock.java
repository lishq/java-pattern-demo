package mediator;

public class Stock extends AbstractColleague {

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    public static int number = 100;

    public static int getNumber() {
        return number;
    }

    public void increase(int number) {
        number += number;
        System.out.println("stock number:" + number);
    }

    public void decrease(int number) {
        number -= number;
        System.out.println("stock number:" + number);
    }

    public void clearStock() {
        System.out.println("clear stock");
        this.mediator.execute("stock.clear");
    }

}

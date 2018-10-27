package bridge;

public class HourceCorp extends Corp {

    public HourceCorp(Product product) {
        super(product);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("hourse make much money.");
    }
}

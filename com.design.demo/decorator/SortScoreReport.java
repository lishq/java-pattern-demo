package decorator;

public class SortScoreReport extends Decorator {

    public SortScoreReport(SchoolReport sr) {
        super(sr);
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }

    public void reportSort() {
        System.out.println("排名从40到30名");
    }
}

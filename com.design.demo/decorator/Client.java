package decorator;

import org.junit.Test;

/**
 * TODO 设计模式之装饰者模式
 * <p>背景：有一次考试，小明考了60分，然后学校出了一个成绩单，
 * 要家长签字。60分，王老汉肯定不签字。这时，需要加两个装饰。
 *
 * 1：最高分是70分，我考了60分。
 * 2：我排名从40到30名。。
 */
public class Client {

    @Test
    public void test() {

        SchoolReport sr = new FourGradeReport();

        sr = new HighScoreReport(sr);

        sr = new SortScoreReport(sr);

        sr.report();

        sr.sign("王老汉");
    }
}

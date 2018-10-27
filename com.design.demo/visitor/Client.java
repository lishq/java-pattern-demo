package visitor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * TODO 设计模式之访问模式
 * <p>背景：如果希望能打印出所有员工的信息（普通员工，经理）。
 * 普通的模板方法可以实现。现在尝试下访问模式。拆分对象：
 * 员工，普通员工，经理，访问类（集中访问信息的操作）
 * <a href="{@docRoot}/../***</a>.
 *
 * @see
 */
public class Client {

    @Test
    public void test() {

        System.out.println(Long.toString(Calendar.getInstance().getTimeInMillis()));
        Visitor visitor = new Visitor();
        for(Employee employee : getData()) {
            employee.accept(visitor);
        }
    }

    public static List<Employee> getData() {
        List<Employee> list = new ArrayList<Employee>();

        list.add(new CommonEmployee("张三", 1000.0, "撸Java"));
        list.add(new CommonEmployee("李四", 1100.0, "撸JS"));
        list.add(new Manager("王五", 11000.0, "吹牛比"));

        return list;
    }
}

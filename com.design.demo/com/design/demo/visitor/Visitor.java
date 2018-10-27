package com.design.demo.visitor;

public class Visitor implements IVisitor {

    @Override
    public void visit(CommonEmployee commonEmployee) {

        System.out.println(this.getCommonEmployeeInfo(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {

        System.out.println(this.getManagerInfo(manager));
    }

    public String getBasicInfo(Employee employee) {

        return employee.getName() + "\t" + employee.getSalary() + "\t";
    }

    public String getManagerInfo(Manager manager) {

        return this.getBasicInfo(manager) + manager.getPerformance() + "\t";
    }

    public String getCommonEmployeeInfo(CommonEmployee commonEmployee) {

        return  this.getBasicInfo(commonEmployee) + commonEmployee.getJob() + "\t";
    }
}

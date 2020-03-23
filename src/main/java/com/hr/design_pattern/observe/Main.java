package com.hr.design_pattern.observe;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 7:21
 */
public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("james band");
        Observe boss=new Boss(employee);
        Observe teamLeader=new TeamLeader(employee);
        employee.addObserve(boss);
        employee.addObserve(teamLeader);
        employee.setVal(10);
        employee.setVal(20);
        employee.setVal(5);
    }
}
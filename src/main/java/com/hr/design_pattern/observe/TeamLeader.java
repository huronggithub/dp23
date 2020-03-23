package com.hr.design_pattern.observe;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 7:13
 */
public class TeamLeader extends Observe{
    public TeamLeader(Employee employee) {
        this.employee=employee;
    }

    @Override
    public void observe() {
        if(employee.val>employee.oldVal) {
            System.out.println("【小组长】发现["+employee.getName()+"]数据增长，从" + employee.oldVal + "变化到" + employee.val+",干的不错");
        }else{
            System.out.println("【小组长】发现["+employee.getName()+"]数据下滑，从" + employee.oldVal + "变化到" + employee.val+",请自我检讨");
        }
    }
}
package com.hr.design_pattern.observe;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 7:13
 */
public class Boss extends Observe{

    public Boss(Employee employee) {
        this.employee=employee;
    }

    @Override
    public void observe() {
        if(employee.val>employee.oldVal) {
            System.out.println("【老板】发现["+employee.getName()+"]数据增长，从" + employee.oldVal + "变化到" + employee.val+",立马加薪");
        }else{
            System.out.println("【老板】发现["+employee.getName()+"]数据下滑，从" + employee.oldVal + "变化到" + employee.val+",下个月工资折半");
        }
    }
}
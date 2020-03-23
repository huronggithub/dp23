package com.hr.design_pattern.mediator;

import java.util.Date;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 5:52
 */
public class ReceptionDesk {

    public static void ordering(Employee employee,String meal){
        System.out.println(new Date().toString()+":["+employee.getName()+"]点餐:"+meal);
    }
}
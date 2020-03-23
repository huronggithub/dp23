package com.hr.design_pattern.mediator;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 6:05
 */
public class Main {

    public static void main(String[] args) {
        Employee zs=new Employee(){{
            setName("张三");
        }};
        Employee ls=new Employee(){{
            setName("李四");
        }};

        ReceptionDesk.ordering(zs,"煲仔饭");
        ReceptionDesk.ordering(ls,"砂锅粥");
    }
}
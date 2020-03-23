package com.hr.design_pattern.null_obj;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 8:35
 */
public class Main {

    public static void main(String[] args) {
        NameMapFactory nameMapFactory=new NameMapFactory();
        System.out.println(nameMapFactory.getNameMap("james").getName());
        System.out.println(nameMapFactory.getNameMap("jack").getName());
        System.out.println(nameMapFactory.getNameMap("tom").getName());
    }
}
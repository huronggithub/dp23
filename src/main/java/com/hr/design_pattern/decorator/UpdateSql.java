package com.hr.design_pattern.decorator;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/19 0019 下午 1:28
 */
public class UpdateSql implements Transaction {

    @Override
    public void executeSql() {
        System.out.println("更新数据");
    }
}
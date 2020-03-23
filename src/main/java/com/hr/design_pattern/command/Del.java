package com.hr.design_pattern.command;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 上午 11:27
 */
public class Del implements Sql{

    private Db db;

    public Del(Db db) {
        this.db=db;
    }

    @Override
    public void execute() {
        db.del();
    }
}
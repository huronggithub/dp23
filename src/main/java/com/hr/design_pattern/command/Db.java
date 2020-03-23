package com.hr.design_pattern.command;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 上午 11:28
 */
public class Db {
    String db;
    String table;

    public void insert(){
        System.out.println("insert into "+db+"."+table);
    }

    public void del(){
        System.out.println("del from "+db+"."+table);
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }
}
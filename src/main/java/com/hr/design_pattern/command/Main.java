package com.hr.design_pattern.command;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 上午 11:33
 */
public class Main {

    public static void main(String[] args) {
        Db db=new Db(){{
            setDb("ds");
            setTable("user");
        }};

        Insert insert=new Insert(db);
        Del del=new Del(db);

        Invoke invoke=new Invoke();
        invoke.putCmd(insert);
        invoke.putCmd(del);
        invoke.executeBatch();
    }
}
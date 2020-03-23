package com.hr.design_pattern.decorator;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/19 0019 下午 1:28
 */
public class UpdateSqlDecorator implements Transaction {

    Transaction transaction;

    public UpdateSqlDecorator(Transaction transaction) {
        this.transaction = transaction;
    }


    public void startTransaction() {
        System.out.println("开始事务");
    }

    public void commitTransaction() {
        System.out.println("提交事务");
    }

    public void rollbackTransaction() {
        System.out.println("事务回滚");
    }

    @Override
    public void executeSql() {
        try {
            startTransaction();
            transaction.executeSql();
            commitTransaction();
        }catch(Exception e){
            rollbackTransaction();
        }
    }

    public static void main(String[] args) {
        Transaction sql=new UpdateSql();
        System.out.println("sql不带事务");
        sql.executeSql();
        System.out.println();

        Transaction transaction=new UpdateSqlDecorator(sql);
        System.out.println("sql在事务内执行");
        transaction.executeSql();

    }
}
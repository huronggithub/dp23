package com.hr.design_pattern.strategy;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 9:09
 */
public class Formula {
    private Strategy strategy;

    public Formula(Strategy strategy) {
        this.strategy = strategy;
    }

    public int doCalc(int a,int b){
        return strategy.doCalc(a,b);
    }

    public static void main(String[] args) {
        Formula formula=new Formula(new AddStrategy());
        System.out.println(formula.doCalc(10,6));

        formula=new Formula(new SubstractStrategy());
        System.out.println(formula.doCalc(10,6));
    }
}
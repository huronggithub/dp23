package com.hr.design_pattern.interpreter;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 3:19
 */
public abstract class SymbolExpression extends Expression {
        Expression left;
        Expression right;

    public SymbolExpression(Expression left,Expression right) {
        this.left = left;
        this.right = right;
    }
}
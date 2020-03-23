package com.hr.design_pattern.interpreter;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 3:23
 */
public class SubtractExpression extends SymbolExpression {

    public SubtractExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    float interpreter() {
        return left.interpreter()-right.interpreter();
    }
}
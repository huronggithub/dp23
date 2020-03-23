package com.hr.design_pattern.interpreter;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 3:19
 */
public class ValExpression extends Expression {
    float val;

    public ValExpression(float val) {
        this.val = val;
    }

    @Override
    float interpreter() {
        return this.val;
    }
}
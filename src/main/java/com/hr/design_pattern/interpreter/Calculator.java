package com.hr.design_pattern.interpreter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Stack;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 3:30
 */
public class Calculator {
    Expression result;

    public Calculator(String input) {
        Stack<Expression> stack=new Stack();
        Expression left = null,right=null;
        int start=0,end=0;
        for (int i = 0; i < input.length(); i++) {
            switch(input.charAt(i)){
                case '+' :
                    left = stack.pop();
                    end=findNextVal(input,start);
                    right=new ValExpression(Float.valueOf(input.substring(start,end)));
                    start=end+1;
                    i=end-1;
                    stack.push(new AddExpression(left,right));
                    break;
                case '-' :
                    left = stack.pop();
                    end=findNextVal(input,start);
                    right=new ValExpression(Float.valueOf(input.substring(start,end)));
                    start=end+1;
                    i=end-1;
                    stack.push(new SubtractExpression(left,right));
                    break;
                default:
                    end=findNextVal(input,start);
                    left=new ValExpression(Float.valueOf(input.substring(start,end)));
                    start=end+1;
                    i=end-1;
                    stack.push(left);
            }
        }
        result=stack.pop();

    }

    private int findNextVal(String input, int start) {
        for (int i = start; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-') {
                return i;
            }
        }
        return input.length();
    }

    public float getResult() {
        return result.interpreter();
    }


    /**
     * 不限位数（Float范围内，可带小数）加减法
     * @param args
     */
    public static void main(String[] args) {
        String str="26.35+6.0+90-500+3.36";
        Calculator calculator = new Calculator(str);
        System.out.println(str+"="+calculator.getResult());
    }
}
package com.wgx.interpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author wgx
 * @since 2023/4/18 16:55
 */
public class Calculator {
    private Expression expression;

    public Calculator(String expStr) {
        Stack<Expression> stack = new Stack<>();
        Expression left = null;
        Expression right = null;
        char[] charArr = expStr.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            switch (charArr[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArr[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArr[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArr[i])));
            }
        }
        this.expression = stack.pop();
    }

    public int run(Map<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}

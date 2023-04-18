package com.wgx.interpreter;

import java.util.Map;

/**
 * @author wgx
 * @since 2023/4/18 16:52
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}

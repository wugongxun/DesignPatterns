package com.wgx.interpreter;

import java.util.Map;

/**
 * @author wgx
 * @since 2023/4/18 16:48
 */
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return var.get(this.key);
    }
}

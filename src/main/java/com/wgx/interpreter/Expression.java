package com.wgx.interpreter;

import java.util.Map;

/**
 * @author wgx
 * @since 2023/4/18 16:46
 */
public abstract class Expression {
    public abstract int interpreter(Map<String, Integer> var);
}

package com.wgx.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author wgx
 * @since 2023/4/18 17:03
 */
public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        Map<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        int res = calculator.run(var);
        System.out.println("计算结果为:" + res);
    }

    private static String getExpStr() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    private static Map<String, Integer> getValue(String expStr) {
        String var = "";
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> vars = new HashMap<>();
        for (int i = 0; i < expStr.length(); i++) {
            char ch = expStr.charAt(i);
            if (ch == '+' || ch == '-') {
                System.out.println("请输入" + var + "的值");
                vars.put(var, scanner.nextInt());
                var = "";
            } else {
                var += ch;
            }
        }
        System.out.println("请输入" + var + "的值");
        vars.put(var, scanner.nextInt());
        return vars;
    }
}

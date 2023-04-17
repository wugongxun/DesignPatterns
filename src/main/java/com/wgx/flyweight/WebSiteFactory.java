package com.wgx.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wgx
 * @since 2023/4/16 17:04
 */
public class WebSiteFactory {
    private Map<String, ConcreteWebSite> pool = new HashMap<>();

    public WebSite getWebSite(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }
}

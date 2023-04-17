package com.wgx.flyweight;

/**
 * @author wgx
 * @since 2023/4/16 17:06
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite webSite = webSiteFactory.getWebSite("新闻");
        webSite.use();
    }
}

package com.domoyun.httpclient;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.ResourceBundle;

/**
 * 读写配置项
 */
public class GetCookies {
    ResourceBundle bundle;
    @BeforeSuite
    public void beforesuite(){
        bundle= ResourceBundle.getBundle("uri");
    }

    @Test
    public void getcookies() throws IOException {
       String uri = bundle.getString("getcookies");
        //GET请求
        HttpGet get =new HttpGet(uri);
        HttpClient client =new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        System.out.println( EntityUtils.toString(response.getEntity(),"utf-8"));
        //获取cookie
        CookieStore cookie =((DefaultHttpClient) client).getCookieStore();
        List<Cookie> cookieList =cookie.getCookies();
        for (Cookie cookie1:cookieList) {
            System.out.println(cookie1.getName() +"        "  +cookie1.getValue() );
    }
    }
}

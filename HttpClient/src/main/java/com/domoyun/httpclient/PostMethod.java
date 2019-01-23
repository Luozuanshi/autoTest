package com.domoyun.httpclient;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.ResourceBundle;

public class PostMethod {
    ResourceBundle bundle;
    CookieStore cookieStore;
    @BeforeSuite
    public void beforesuite(){
        bundle= ResourceBundle.getBundle("uri");

    }
    @Test
    public void getCookies() throws IOException {
        String uri = bundle.getString("getcookies");
        //GET请求
        HttpGet get =new HttpGet(uri);
        HttpClient client =new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        System.out.println( EntityUtils.toString(response.getEntity(),"utf-8"));
        //获取cookie
        cookieStore =((DefaultHttpClient) client).getCookieStore();
        List<Cookie> cookieList =cookieStore.getCookies();
        for (Cookie cookie1:cookieList) {
            System.out.println(cookie1.getName() +"        "  +cookie1.getValue() );
        }
    }
    @Test(dependsOnMethods = "getCookies")
    public void postMethodCarryCookieAccess() throws IOException {
        //获取uri地址
        String uri = bundle.getString("postwithcookie");
        //创建一个httpclient对象
        DefaultHttpClient client = new DefaultHttpClient();
        //创建一个请求POST方法对象
        HttpPost post =new HttpPost(uri);

        //设置请求头
        post.setHeader("content-type","application/json");
        //设置参数
        JSONObject json =new JSONObject();
        json.put("name","pangluo");
        json.put("age","18");

        StringEntity entity = new StringEntity(json.toString(),"utf-8");
        post.setEntity(entity);
        //设置cookie
        client.setCookieStore(cookieStore);
        //httpclient执行excute方法
        HttpResponse response = client.execute(post);
        //获取响应体响应结果
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(result);

        //断言
        JSONObject reslujson =new JSONObject(result);
        String responsesult = (String) reslujson.get("response");
        Assert.assertEquals("OK",responsesult);
    }
}

package com.domoyun.testng.Group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author shkstart
 * @create 2018-12-10 12:26
 */
public class GroupOnMethod {
    @Test(groups = "server")
    public static void test1(){
        System.out.println("这是服务器端的测试方法11");
    }
    @Test(groups = "server")
    public static void test2(){
        System.out.println("这是服务器端的测试方法22");
    }
    @Test(groups = "client")
    public static void test3(){
        System.out.println("这是客户端的测试方法11");
    }
    @Test(groups = "client")
    public static void test4(){
        System.out.println("这是客户端的测试方法22");
    }
    @BeforeGroups("server")
    public static void BeforeGroupsOnserver(){
        System.out.println("这是服务器端组运行之前的方法");
    }
    @AfterGroups("server")
    public static void AfterGroupsOnserver(){
        System.out.println("这是服务器端组运行之后的方法");
    }
    @BeforeGroups("client")
    public static void BeforeGroupsOnclient(){
        System.out.println("这是客户端组运行之前的方法");
    }
    @AfterGroups("client")
    public static void AfterGroupsOnclient(){
        System.out.println("这是客户端组运行之后的方法");
    }
}

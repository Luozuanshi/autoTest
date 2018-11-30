package com.domoyun.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author shkstart
 * @create 2018-11-30 13:02
 */
public class BasicAnnotation {

    //最基本注解，用来把方法标注为测试的一部分
    @Test
    public static void testCase1(){
        System.out.println("这是一个测试用例1");
    }

    @Test
    public static void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public static void BeforeMethod(){
        System.out.println("BeforeMethod是在测试方法运行之前运行的");
    }

    @AfterMethod
    public static void AfterMethod(){
        System.out.println("AfterMethod是在测试方法运行之后运行的");
    }
}

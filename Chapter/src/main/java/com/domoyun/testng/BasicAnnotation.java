package com.domoyun.testng;

import org.testng.annotations.*;

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
    @BeforeClass
    public static void BeforeClass(){

        System.out.println("BeforeClass这是在类运行之前运行的方法");
    }
    @AfterClass
    public static void afterClass(){

        System.out.println("AfterClass这是在类运行之后运行的方法");
    }
    @BeforeSuite()
    public static void BeforeSuite() {
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite()
    public static void AfterSuite(){
        System.out.println("AfterSuite测试套件");
    }
}

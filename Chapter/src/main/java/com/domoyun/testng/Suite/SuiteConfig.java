package com.domoyun.testng.Suite;

import org.testng.annotations.*;

/**
 * @author shkstart
 * @create 2018-12-09 22:24
 */
public class SuiteConfig {
    @BeforeSuite
    public static void BeforeSuite(){
        System.out.println("BeforeSuite");
    }
    @AfterSuite
    public static void AfterSuite(){
        System.out.println("AfterSuite");
    }
    @BeforeClass
    public static void BeforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void AfterClass(){
        System.out.println("AfterClass");
    }
    @BeforeTest
    public static void BeforeTest(){
        System.out.println("BeforeTest");
    }
    @AfterTest()
    public static void AfterTest(){
        System.out.println("AfterTest");
    }

}

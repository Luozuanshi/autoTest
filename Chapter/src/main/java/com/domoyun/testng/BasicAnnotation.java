package com.domoyun.testng;

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
}

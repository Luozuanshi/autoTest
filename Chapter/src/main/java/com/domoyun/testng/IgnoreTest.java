package com.domoyun.testng;

import org.testng.annotations.Test;

/**
 * @author shkstart
 * @create 2018-12-10 12:17
 */
public class IgnoreTest {
    @Test
    public static void Ignore1(){
        System.out.println("ignore 1");
    }
    @Test(enabled = false)
    public static void Ignore2(){
        System.out.println("ignore 2");
    }
    @Test(enabled = true)
    public static void Ignore3(){
        System.out.println("ignore 3");
    }
}

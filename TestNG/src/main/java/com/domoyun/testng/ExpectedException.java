package com.domoyun.testng;

import org.testng.annotations.Test;

/**
 * @author shkstart
 * @create 2018-12-11 12:46
 */
public class ExpectedException {
    //异常测试，在一下测试方法中必须捕获到指定异常，如果没有捕获到，则testNG测试失败
    @Test(expectedExceptions = RuntimeException.class)
    public void expectedExceptionsOnFial(){
        System.out.println("异常测试1");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void expectedExceptionsOnOk(){
        System.out.println("异常测试2");
        throw new RuntimeException();
    }
}

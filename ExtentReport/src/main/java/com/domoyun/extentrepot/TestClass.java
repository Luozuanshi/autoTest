package com.domoyun.extentrepot;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void test1() {
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2() {
        Assert.assertEquals(1,2);
    }

    @Test
    public void test3() {
        Assert.assertEquals("aaa","aaa");
    }

    @Test
    public void logDemo() {
        Reporter.log("Reporter输出日志");
        throw new RuntimeException("运行时异常");

    }
}

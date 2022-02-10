package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {
    /**
     * test1执行成功test2才执行，否则不执行自动忽略执行
     */
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("test2 run");
    }
}

package com.course.testng;

import org.testng.annotations.Test;

public class IgoreTest {
    /**
     *忽略不执行测试用例
     */
    @Test
    public  void  ignore1(){
        System.out.println("未忽略测试");
    }
    @Test(enabled = false)
    public  void  ignore2(){
        System.out.println("忽略测试");
    }
    @Test(enabled = true)
    public void ignore3(){
        System.out.println("未忽略测试");
    }
}

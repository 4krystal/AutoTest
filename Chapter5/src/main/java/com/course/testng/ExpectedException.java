package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     * 在我们期望结果为某个异常的时候使用异常测试
     * 比如传入不合法的参数程序会报异常，我们的预期结果就是报异常时使用
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeSucess(){
        System.out.println("异常测试成功");
        throw new RuntimeException();
    }
}

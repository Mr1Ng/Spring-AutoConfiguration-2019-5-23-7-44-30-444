package com.zhengdianfang.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private User user;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testUserProperties() {
        System.out.println(user);
        Assert.assertEquals(user.getUsername(), "张三");
        Assert.assertEquals(user.getAge(), 14);
        Assert.assertEquals(user.getAddress(), "北京市东城区 张三收");
    }

}

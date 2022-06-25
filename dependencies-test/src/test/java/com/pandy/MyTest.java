package com.pandy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author: Pandy
 * @create: 2022/6/25
 **/

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyTest {

    @Autowired
    private ThreadPoolExecutor threadPoolExecutor;

    @Test
    public void test() {
        System.out.println(threadPoolExecutor.getCorePoolSize());
    }
}

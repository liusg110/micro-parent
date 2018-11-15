package com.xy.client1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MicroClient1Application .class) // 指定我们SpringBoot工程的Application启动类
@WebAppConfiguration
public class MicroClient1ApplicationTests {

    @Autowired
    private RabbitClent rabbitClent;




    @Test
    public void contextLoads() {
        rabbitClent.sendForTopic();

    }


    @Test
    public void contextLoads1() {
        rabbitClent.sendForDirect();

    }

}

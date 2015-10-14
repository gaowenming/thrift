/**
 * @Title SmartServiceTest.java
 * @Package com.smart.thrift.client
 * @author gaowenming
 * @date 2015年10月13日 上午11:48:18
 * @version V1.0
 */
package com.smart.thrift.client;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.smart.thrift.service.api.HelloService;
import com.smart.thrift.service.api.SmartService;

/**
 * @Description 
 * @author gaowenming
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context-thrift-client.xml" })
public class SmartServiceTest {

    @Resource
    private SmartService.Iface smartSerivce;

    @Resource
    private HelloService.Iface helloService;

    /**
     * @Description 
     * @param args
     */
    @Test
    public void test() {
        try {
            helloService.sayHello();
            System.out.println(smartSerivce.getUserById(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

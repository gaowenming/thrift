/**
 * @Title SmartServiceTest.java
 * @Package com.smart.thrift.client
 * @author gaowenming
 * @date 2015年10月13日 上午11:48:18
 * @version V1.0
 */
package com.smart.thrift.client;

import org.apache.thrift.TException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smart.thrift.service.api.HelloService;
import com.smart.thrift.service.api.SmartService;

/**
 * @Description 
 * @author gaowenming
 */
public class SmartServiceTest {

    /**
     * @Description 
     * @param args
     */
    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context-thrift-client.xml");
            SmartService.Iface smartSerivce = (SmartService.Iface) context.getBean("smartService");
            HelloService.Iface helloService = (HelloService.Iface) context.getBean("helloService");
            try {
                Thread.sleep(1000);
                for (int i = 0; i < 10; i++) {
                    TThread t = new TThread(smartSerivce);
                    t.start();
                    helloService.sayHello();
                }
                Thread.sleep(3000000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class TThread extends Thread {
        SmartService.Iface smartSerivce;

        TThread(SmartService.Iface service) {
            smartSerivce = service;
        }

        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + "  " + smartSerivce.getUserById(1));
            } catch (TException e) {
                e.printStackTrace();
            }
        }
    }

}

/**
 * @Title SmartServiceTest.java
 * @Package com.smart.thrift.client
 * @author gaowenming
 * @date 2015年10月13日 上午11:48:18
 * @version V1.0
 */
package com.smart.thrift.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smart.thrift.service.api.TSmartService.Iface;

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
            Iface smartSerivce = (Iface) context.getBean("smartService");
            try {
                System.out.println(smartSerivce.getUserById(1));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

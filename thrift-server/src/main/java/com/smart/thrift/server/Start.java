/**
 * @author gaowenming
 * @date 2015年10月13日 上午11:42:18
 * @version V1.0
 */
package com.smart.thrift.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description 服务启动
 * @author gaowenming
 */
public class Start {
    public static void main(String[] args) {
        try {
            new ClassPathXmlApplicationContext("classpath:spring-context-thrift-server.xml");
            Thread.sleep(3000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

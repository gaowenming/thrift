package com.smart.thrift.client;

import javax.annotation.Resource;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
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
     * zk发现服务
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

    /**
     * 普通rpc调用
     * @Description
     */
    @Test
    public void testSimple() {
        try {
            TSocket socket = new TSocket("127.0.0.1", 9001);
            TTransport transport = new TFramedTransport(socket);
            TProtocol protocol = new TBinaryProtocol(transport);
            HelloService.Client client = new HelloService.Client(protocol);
            transport.open();
            client.sayHello();
            transport.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

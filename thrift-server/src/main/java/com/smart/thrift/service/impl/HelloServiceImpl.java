/**
 * @Title HelloServiceImpl.java
 * @Package com.smart.thrift.service.impl
 * @author gaowenming
 * @date 2015年10月13日 下午2:27:50
 * @version V1.0
 */
package com.smart.thrift.service.impl;

import org.apache.thrift.TException;

import com.smart.thrift.service.api.HelloService.Iface;

/**
 * @Description 
 * @author gaowenming
 */
public class HelloServiceImpl implements Iface {

    /**
     * @Description 
     * @throws TException
     */
    @Override
    public void sayHello() throws TException {
        System.out.println("hello world!");
    }

}

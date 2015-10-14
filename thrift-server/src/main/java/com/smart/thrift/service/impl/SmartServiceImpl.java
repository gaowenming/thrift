/**
 * @author gaowenming
 * @date 2015年10月13日 上午11:10:59
 * @version V1.0
 */
package com.smart.thrift.service.impl;

import org.apache.thrift.TException;

import com.smart.thrift.service.api.SmartService;
import com.smart.thrift.service.struct.User;

/**
 * @Description 
 * @author gaowenming
 */
public class SmartServiceImpl implements SmartService.Iface {

    /**
     * @Description 
     * @param id
     * @return
     * @throws TException
     */
    @Override
    public User getUserById(int id) throws TException {
        System.out.println("server start ,id= " + id);
        return new User(1, "name", "pass");
    }

}

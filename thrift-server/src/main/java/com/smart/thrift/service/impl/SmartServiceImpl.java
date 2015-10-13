/**
 * @author gaowenming
 * @date 2015年10月13日 上午11:10:59
 * @version V1.0
 */
package com.smart.thrift.service.impl;

import org.apache.thrift.TException;

import com.smart.thrift.service.api.TSmartService.Iface;
import com.smart.thrift.service.struct.TUser;

/**
 * @Description 
 * @author gaowenming
 */
public class SmartServiceImpl implements Iface {

    /**
     * @Description 
     * @param id
     * @return
     * @throws TException
     */
    @Override
    public TUser getUserById(int id) throws TException {
        System.out.println("server start ,id= " + id);
        return new TUser(1,"name","pass");
    }

}

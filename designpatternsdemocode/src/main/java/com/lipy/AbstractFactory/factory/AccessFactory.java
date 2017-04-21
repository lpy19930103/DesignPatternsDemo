package com.lipy.AbstractFactory.factory;

import com.lipy.AbstractFactory.server.AccessDepartment;
import com.lipy.AbstractFactory.server.AccessUser;
import com.lipy.AbstractFactory.server.IDepartment;
import com.lipy.AbstractFactory.server.IUser;

/**
 * ÊµÀý»¯AccessUser
 * Created by lipy on 2017/4/21 0021.
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}

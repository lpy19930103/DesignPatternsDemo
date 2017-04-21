package com.lipy.AbstractFactory.factory;

import com.lipy.AbstractFactory.server.IDepartment;
import com.lipy.AbstractFactory.server.IUser;
import com.lipy.AbstractFactory.server.SqlServerDepartment;
import com.lipy.AbstractFactory.server.SqlServerUser;

/**
 * ÊµÀý»¯SqlServerUser
 * Created by lipy on 2017/4/21 0021.
 */
public class SqlServerFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}

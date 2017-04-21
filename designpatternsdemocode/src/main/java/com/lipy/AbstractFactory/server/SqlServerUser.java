package com.lipy.AbstractFactory.server;

import com.lipy.AbstractFactory.dao.User;

/**
 * 用于访问Sql的User
 * Created by lipy on 2017/4/21 0021.
 */
public class SqlServerUser implements IUser {

    public void insert(User user) {
        System.out.println("在 SqlServer 中给User表中添加了一条数据");
    }

    public User getUser(int userId) {
        System.out.println("在 SqlServer 中根据id 得到User数据");
        return null;
    }
}

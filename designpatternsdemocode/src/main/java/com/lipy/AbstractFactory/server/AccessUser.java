package com.lipy.AbstractFactory.server;

import com.lipy.AbstractFactory.dao.User;

/**
 * 用于访问Access的User
 * Created by lipy on 2017/4/21 0021.
 */
public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在 Access 中给User表中添加了一条数据");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在 Access 中根据id 得到User数据");
        return null;
    }
}

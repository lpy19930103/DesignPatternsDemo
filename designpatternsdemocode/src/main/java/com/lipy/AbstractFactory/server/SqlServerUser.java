package com.lipy.AbstractFactory.server;

import com.lipy.AbstractFactory.dao.User;

/**
 * ���ڷ���Sql��User
 * Created by lipy on 2017/4/21 0021.
 */
public class SqlServerUser implements IUser {

    public void insert(User user) {
        System.out.println("�� SqlServer �и�User���������һ������");
    }

    public User getUser(int userId) {
        System.out.println("�� SqlServer �и���id �õ�User����");
        return null;
    }
}

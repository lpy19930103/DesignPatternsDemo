package com.lipy.AbstractFactory.server;

import com.lipy.AbstractFactory.dao.User;

/**
 * ���ڷ���Access��User
 * Created by lipy on 2017/4/21 0021.
 */
public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("�� Access �и�User���������һ������");
    }

    @Override
    public User getUser(int id) {
        System.out.println("�� Access �и���id �õ�User����");
        return null;
    }
}

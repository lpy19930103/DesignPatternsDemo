package com.lipy.AbstractFactory.server;

import com.lipy.AbstractFactory.dao.User;

/**
 * ���ڿͻ��˷���,�����������ݿ���ʵ����
 * Created by lipy on 2017/4/21 0021.
 */
public interface IUser {

    void insert(User user);

    User getUser(int id);

}

package com.lipy.AbstractFactory.server;

import com.lipy.AbstractFactory.dao.User;

/**
 * 用于客户端访问,解除与具体数据库访问的耦合
 * Created by lipy on 2017/4/21 0021.
 */
public interface IUser {

    void insert(User user);

    User getUser(int id);

}

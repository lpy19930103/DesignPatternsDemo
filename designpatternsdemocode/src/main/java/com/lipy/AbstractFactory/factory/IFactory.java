package com.lipy.AbstractFactory.factory;

import com.lipy.AbstractFactory.server.IDepartment;
import com.lipy.AbstractFactory.server.IUser;

/**
 * 一个创建访问User表对象的抽象工厂接口
 * Created by lipy on 2017/4/21 0021.
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}

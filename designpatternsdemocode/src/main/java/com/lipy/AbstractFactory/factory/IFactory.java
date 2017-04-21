package com.lipy.AbstractFactory.factory;

import com.lipy.AbstractFactory.server.IDepartment;
import com.lipy.AbstractFactory.server.IUser;

/**
 * һ����������User�����ĳ��󹤳��ӿ�
 * Created by lipy on 2017/4/21 0021.
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}

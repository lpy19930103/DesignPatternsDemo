package com.lipy.AbstractFactory;

import com.lipy.AbstractFactory.dao.Department;
import com.lipy.AbstractFactory.dao.User;
import com.lipy.AbstractFactory.factory.DataAccess;
import com.lipy.AbstractFactory.server.IDepartment;
import com.lipy.AbstractFactory.server.IUser;

/**
 * ���󹤳�ģʽ��Abstract Factory Pattern���ǹ�������ģʽ�Ľ�һ������
 * Ϊ����һ����ػ��໥�����Ķ����ṩһ����ڣ�����ָ�����ǵľ����ࡣ
 *
 * �ͻ���
 * Created by lipy on 2017/4/21 0021.
 */
class TheClient {

    public static void main(String[] args) {

        User user = new User();

        Department department = new Department();

//        IFactory iFactory = new SqlServerFactory();
//        IUser iUser = iFactory.createUser();
//        IDepartment iDepartment = iFactory.createDepartment();

        IUser iUser = DataAccess.createUser();
        IDepartment iDepartment = DataAccess.createDepartment();

        iUser.insert(user);
        iUser.getUser(1);

        iDepartment.insert(department);
        iDepartment.getDepartment(0);

    }
}

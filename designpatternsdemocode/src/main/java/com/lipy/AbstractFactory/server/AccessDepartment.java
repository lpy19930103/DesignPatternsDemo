package com.lipy.AbstractFactory.server;

import com.lipy.AbstractFactory.dao.Department;

/**
 * ���ڷ���Sql��User
 * Created by lipy on 2017/4/21 0021.
 */
public class AccessDepartment implements IDepartment {

    public void insert(Department department) {
        System.out.println("�� Access �и�Department���������һ������");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("�� Access �и���id �õ�Department����");
        return null;
    }

}

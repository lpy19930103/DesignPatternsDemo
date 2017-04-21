package com.lipy.AbstractFactory.server;

import com.lipy.AbstractFactory.dao.Department;

/**
 * 用于访问Sql的User
 * Created by lipy on 2017/4/21 0021.
 */
public class SqlServerDepartment implements IDepartment {

    public void insert(Department department) {
        System.out.println("在 SqlServer 中给Department表中添加了一条数据");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在 SqlServer 中根据id 得到Department数据");
        return null;
    }

}

package com.lipy.AbstractFactory.server;


import com.lipy.AbstractFactory.dao.Department;

/**
 * Created by lipy on 2017/4/21 0021.
 */
public interface IDepartment {

    void insert(Department department);

    Department getDepartment(int id);
}

package com.lipy.AbstractFactory.factory;

import com.lipy.AbstractFactory.dao.Business;
import com.lipy.AbstractFactory.server.IDepartment;
import com.lipy.AbstractFactory.server.IUser;


/**
 * 通过反射方式实例化
 * Created by lipy on 2017/4/21 0021.
 */
public class DataAccess {

    private static final String assemblyName = "com.lipy.AbstractFactory.server";

//    private static final String db = ".SqlServer";
    private static final String db = Business.getDbName();

    public static IUser createUser() {
        String className = assemblyName + db + "User";
        IUser iUser = null;
        try {
            Class clazz = Class.forName(className);
            iUser = (IUser) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return iUser;
    }

    public static IDepartment createDepartment() {

        String className = assemblyName + db + "Department";
        IDepartment department = null;
        try {
            Class clazz = Class.forName(className);
            department = (IDepartment) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return department;
    }

}

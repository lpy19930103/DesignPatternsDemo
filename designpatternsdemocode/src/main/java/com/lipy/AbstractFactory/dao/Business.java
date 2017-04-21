package com.lipy.AbstractFactory.dao;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * 通过读取配置文件方式获得db的名字,遵循开闭原则
 * Created by lipy on 2017/4/21 0021.
 */
public class Business {

    private String dbName = ".Access";

    public String getDbName() {
        try {
            InputStream inputStream = new FileInputStream
                    ("E:/project/DesignPatternsDemo/designpatternsdemocode/src/main/java/com/lipy/AbstractFactory/dao/db.config");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document dom = builder.parse(inputStream);
            Element root = dom.getDocumentElement();
            NodeList items = root.getElementsByTagName("db");//查找所有person节点
            for (int i = 0; i < items.getLength(); i++) {
                Element personNode = (Element) items.item(i);
                dbName = personNode.getAttribute("name");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dbName;
    }

}

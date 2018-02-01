package com.example;

/**
 * Created by Administrator on 2018/2/1.
 */

public class Test {

    public static void main(String[] args) throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(4);
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);
        linkedList.display();
        linkedList.insert(0);
        linkedList.display();
        linkedList.delete(4);
        linkedList.display();
        linkedList.find(3);


    }


}

package com.example;

public class LinkedList {


    private class Data {
        private Object object;
        private Data next = null;

         Data(Object object) {
            this.object = object;
        }
    }

    private Data first = null;

    public void insert(Object object) {
        Data data = new Data(object);
        data.next = first;
        first = data;
    }

    public void delete(Object object) throws Exception {
        if (first == null) {
            throw new Exception("empty");
        }
        if (first.object.equals(object)) {
            first = first.next;
        } else {
            Data pre = first;
            Data cur = first.next;
            while (cur != null) {
                if (cur.object.equals(object)) {
                    pre.next = cur.next;
                }
                pre = cur;
                cur = cur.next;

            }
        }
    }

    public Object find(Object object) throws Exception {
        if (first == null) {
            throw new Exception("empty");
        }
        Data temp = first;

        while (temp != null) {
            if (temp.object.equals(object)) {
                return temp.object;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void display() {
        if (first == null)
            System.out.println("empty");
        Data cur = first;
        while (cur != null) {
            System.out.print(cur.object.toString() + " -> ");
            cur = cur.next;
        }
        System.out.print("\n");
    }
}

package com.company;

/**
 *
 * @author vansh
 */
public class Main {

    public static void main(String[] args) {

        DynamicArray list = new DynamicArray(3);
        list.add(15);
        list.add(19);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.search(15));
        list.delete(2);


        list.print();



    }
}

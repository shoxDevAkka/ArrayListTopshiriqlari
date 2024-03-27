package com.ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class topshiriq_5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("red");
        list.add("green");
        list.add("yellow");
        list.add("blue");
        list.add("black");
        list.add("white");
        list.add("orange");

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("brown");
        list1.add("green");
        list1.add("yellow");
        list1.add("blue");
        list1.add("aqua");
        list1.add("white");
        list1.add("purple");

//        a)

        System.out.println("list ilk ko'rinishi : " + list);
        Collections.swap(list, 2, 5);
        System.out.println("list-ning o'zgargan ko'rinishi : " + list);

//        b)

        System.out.println();
        System.out.println("list ilk ko'rinishi : " + list);
        list.addAll(list1);
        System.out.println("list-ning list1 bilan ko'rinishi : " + list);

//        c)

        ArrayList<String> arrayList = new ArrayList<String>(3);
        arrayList.add("red");
        arrayList.add("green");
        arrayList.add("yellow");
        arrayList.add("brown");

        arrayList.ensureCapacity(6);
    }
}

package com.ArrayListPractice;

import java.util.ArrayList;

public class topshiriq_4 {
    public static void main(String[] args) {

//        a)
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

        list.retainAll(list1);
        System.out.println("list-ning list1 bilan umumiy qiymatlari : " + list);

    }
}

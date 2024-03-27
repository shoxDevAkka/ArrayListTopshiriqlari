package com.ArrayListPractice;

import java.util.ArrayList;

public class topshiriq_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

//        a)
        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        list.add("Blue");
        list.add("Black");
        list.add("White");
        list.add("Orange");

//        b)
        list.set(0, "Brown");

//        c)
        System.out.println("Ranglar :");

        for (String color : list){
            System.out.println(color);
        }

        System.out.println("ArrayList o'lchami : " + list.size());
    }
}

package com.ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class topshiriq_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("red");
        list.add("green");
        list.add("yellow");
        list.add("blue");
        list.add("black");
        list.add("white");
        list.add("orange");

//        a)

        System.out.println("list ilk ko'rinishi : " + list);
        Collections.reverse(list);
        System.out.println("list teskari tartibda joylashgan holati : " + list);

//        b)

        System.out.println("(int firstIndex, int lastIndex) qiymatlar bo’yicha bo’lagini kesib olingan to'plam : " + list.subList(2,7));

    }
}

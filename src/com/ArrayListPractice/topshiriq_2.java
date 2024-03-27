package com.ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class topshiriq_2 {
    public static void main(String[] args) {

//        a)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qidirilayotgan rangni kiriting yoki boshini kiriting :");
        String text = scanner.next();

        ArrayList<String> list = new ArrayList<>();

        list.add("red");
        list.add("green");
        list.add("yellow");
        list.add("blue");
        list.add("black");
        list.add("white");
        list.add("orange");

        boolean found = false;
        if (list.contains(text)){
            System.out.println("Qidirilayotgan " + text + " rang to'plamda mavjud");
        } else {
            for (String color : list){
                if (color.startsWith(text)){
                    System.out.println("Qidirilayotgan " + color + " rang to'plamda mavjud");
                    found = true;
                }
            }

            if (found){
                System.out.println("To'plamda moslik topilmadi!");
            }
        }

//        b)
        System.out.println();
        ArrayList<String> list1 = new ArrayList<>(list);
        System.out.println("list-to'plam nusxasi : " + list1);

//        c)

        System.out.println();
        System.out.println("Ilk ko'rinishi : " + list);
        Collections.shuffle(list);
        System.out.println("Aralashgan holati : " + list);

    }
}

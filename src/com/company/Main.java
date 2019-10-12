package com.company;

import java.awt.List;
import java.util.*;

public class Main {


    public static void main(String[] args) {


        ArrayList<String> listA = new ArrayList<>(5);
        while (listA.size() < 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя для списка А: ");
            String s = scanner.nextLine();
            listA.add(s);
        }
        System.out.println("Имя: " + listA);


        System.out.println("___________________________");

        ArrayList<String> listB = new ArrayList<>(5);
        while (listB.size() < 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя для списка Б: ");
            String s = scanner.nextLine();
            listB.add(s);
        }
        System.out.println("Имя: " + listB);

        System.out.println("___________________________");

        ArrayList<String> listC = new ArrayList<>(10);
        listC.add(listA.get(0));
        listC.add(listB.get(4));
        listC.add(listA.get(1));
        listC.add(listB.get(3));
        listC.add(listA.get(2));
        listC.add(listB.get(2));
        listC.add(listA.get(3));
        listC.add(listB.get(1));
        listC.add(listA.get(4));
        listC.add(listB.get(0));

        System.out.println(listC);

        System.out.println("___________________________");


        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String x1, String x2) {
                return x1.length() - x2.length();
            }
        });

        for (String s : listC) {
            System.out.println(s);

        }

    }
}









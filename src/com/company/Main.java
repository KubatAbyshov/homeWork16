package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>(5);
        while (listA.size() < 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя для списка А: ");
            String s = scanner.nextLine();
            listA.add(s);
            listA.toArray();
        }
        System.out.println("Имя: " + listA);


        System.out.println("___________________________");

        ArrayList<String> listB = new ArrayList<>(5);
        while (listB.size() < 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя для списка Б: ");
            String s = scanner.nextLine();
            listB.add(s);
            listB.toArray();
        }
        Collections.reverse(listB);
        System.out.println("Имя: " + listB);

        System.out.println("___________________________");

        ArrayList<String> listC = new ArrayList<>(10);

        Iterator i1 = listA.iterator();
        Iterator i2 = listB.iterator();

        while (i1.hasNext() || i2.hasNext()) {

            listC.add((String) i1.next());
            listC.add((String) i2.next());
        }
        System.out.println(listC);
        System.out.println("___________________________");


        Collections.sort(listC, new Comparator<String>() {

            public int compare(String x1, String x2) {
                return x1.length() - x2.length();
            }
        });
        System.out.println(listC);
    }

}






























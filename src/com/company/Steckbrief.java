package com.company;

import java.util.Scanner;

public class Steckbrief {

    public static void main(String[] args) {
        System.out.print("Name eingeben:");
        Scanner name = new Scanner(System.in);
        String n = name.next();

        System.out.print("Alter eingeben:");
        Scanner alter = new Scanner(System.in);
        int a = alter.nextInt();

        System.out.print("Geschlecht m/w:");
        Scanner geschlecht = new Scanner(System.in);
        String g = geschlecht.next();

        System.out.println("Name: " + n);
        System.out.println("Alter: " + a);
        System.out.println("Geschlecht: " + g);



    }
}

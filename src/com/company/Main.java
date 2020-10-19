package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Name eingeben:");
        Scanner name = new Scanner(System.in);
        String n = name.next();

        System.out.println("Alter eingeben:");
        Scanner alter = new Scanner(System.in);
        int a = alter.nextInt();

        System.out.println("Geschlecht m/w:");
        Scanner geschlecht = new Scanner(System.in);
        String g = geschlecht.next();

        System.out.println("Name: " + n);
        System.out.println("Alter: " + a);
        System.out.println("Geschlecht: " + g);


    }
}

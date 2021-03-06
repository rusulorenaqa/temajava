package com.lorena;

import java.util.*;

public class Read {

    //ex 1

    public int getInt() {

        boolean repeat = true;
        int myInt = 0;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number: ");
                myInt = scanner.nextInt();

                repeat = false;

            } catch (InputMismatchException error) {
                System.out.println("Incorrect value entered, pls try again.");
            }
        } while (repeat == true);
        return myInt;
    }

    //ex 2

    public float getFloat() {

        boolean repeat = true;
        float myFloat = 0;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number: ");
                myFloat = scanner.nextFloat();

                repeat = false;

            } catch (InputMismatchException error) {
                System.out.println("Incorrect value entered, pls try again.");
            }
        } while (repeat == true);
        return myFloat;
    }

    public double getDouble() {

        boolean repeat = true;
        double myDouble = 0;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number: ");
                myDouble = scanner.nextDouble();

                repeat = false;

            } catch (InputMismatchException error) {
                System.out.println("Incorrect value entered, pls try again.");
            }
        } while (repeat == true);
        return myDouble;
    }

    public long getLong() {

        boolean repeat = true;
        long myLong = 0;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number: ");
                myLong = scanner.nextLong();

                repeat = false;

            } catch (InputMismatchException error) {
                System.out.println("Incorrect value entered, pls try again.");
            }
        } while (repeat == true);
        return myLong;
    }
    // ex 3

    public int[] getArray(int a) {
        int position = a;
        int i = 0;
        int[] Array = new int[a];
        do {

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number: ");
                position = scanner.nextInt();
                Array[i] = position;
                i = i + 1;
            } catch (InputMismatchException error) {
                System.out.println("Introduceti alt numar!");
            }
        }
        while (i < a);
        System.out.println(Arrays.toString(Array));
        return Array;

    }

    // ex 4
    public List<Integer> getList(int a) {
        List myList = new ArrayList();
        int i = 0;


        do {

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number: ");
                i = scanner.nextInt();
                myList.add(i);



            } catch (InputMismatchException error) {

                System.out.println("Insert a number! ");
            }
        }
        while (myList.size()!=a);
        System.out.println("Lista intiala este: " + myList.toString());
        return myList;


    }


    // ex 5
    public String getString(String text){


    boolean repeat = true;
    String myString = " ";
        do {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter " + text);
            myString= scanner.next();

            repeat = false;

        } catch (InputMismatchException error) {
            System.out.println("Incorrect value entered, pls try again.");
        }
    } while (repeat == true);
        return myString;
}

    // ex 6
}
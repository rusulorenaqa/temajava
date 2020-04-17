package com.lorena;

public class Main {

    public static void main(String[] args) {
        // ex1
        sayHello();
        displaySum(3, 5);
        displayDivide(3, 5);
        operatia1();
        operatia2();
        operatia3();
        operatia4();

        //ex 2
        System.out.println("Suma dintre numere este: " + sum(1, 2));
        System.out.println("Diferenta dintre numere este: " + substract(1, 2));
        System.out.println("Inmultirea dintre numere este: " + multiply(1, 2));
        System.out.println("Impartirea dintre numere este: " + divide(1, 2));
        // ex 3
        showJava();
        // ex 4
        System.out.println("Media dintre numere este:" + average(1, 2, 7));
        // ex 5
        showFace();
        // ex 6
        System.out.println("Restul impartirii este: " + restImpartire(13, 7));
        //ex 7
        System.out.println("Conversia a 57 grade F in C:" + convertToCelsius(57));
        //ex 8
        System.out.println("50 de inch reprezinta metrii:" + inchToMeters(50));
        //ex 9
        showSpeed(5000, 1, 3, 54);
    }
    public static void sayHello() {
        System.out.println("Hello");
        System.out.println("Lorena");
    }
    public static void displaySum(int a, int b) {
        System.out.println("Suma dintre 3 si 5 este: " + (a + b));
    }
    public static void displayDivide(float a, float b) {
        System.out.println("Impartirea dintre 3 si 5 este: " + (a / b));
    }
    public static void operatia1() {
        int t = 5;
        int r = 8;
        int p = 6;
        System.out.println("Rezultatul operatiei -5.0+8.0*6.0 este: " + (-t + r * p));
    }
    public static void operatia2() {
        System.out.println("Rezultatul operatiei (55.0+9)%9 este: " + ((55.0 + 9) % 9));
    }
    public static void operatia3() {
        System.out.println("Rezultatul operatiei 20.0+(-3.0)*5.0/8.0 este: " + (20.0 + (-3.0) * 5.0 / 8.0));
    }
    public static void operatia4() {
        System.out.println("Rezultatul operatiei 5.0+15.0/3.0*2.0-8.0%3.0 este: " +
                (5.0 + 15.0 / 3.0 * 2.0 - 8.0 % 3.0));
    }
    public static float sum(float a, float b) {
        return a + b;
    }
    public static float substract(float a, float b) {
        return a - b;
    }
    public static float multiply(float a, float b) {
        return a * b;
    }
    public static float divide(float a, float b) {
        return a / b;
    }
    public static void showJava() {
        System.out.println("" +
                "   J    a   v     v  a \n" +
                "   J   a a   v   v  a a\n" +
                "J  J  aaaaa   V V  aaaaa\n" +
                " JJ  a     a   V  a     a");
    }
    public static float average(float a, float b, float c) {
        return ((a + b + c) / 3);
    }
    public static void showFace() {
        System.out.println("" +
                " +\"\"\"\"\"+\n" +
                "[| o o |]\n" +
                " |  ^  |\n" +
                " | '-' |\n" +
                " +-----+");
    }
    public static int restImpartire(int a, int b) {
        return a % b;
    }
    public static double convertToCelsius(double f) {
        return 5.0 / 9.0 * (f - 32);
    }
    public static double inchToMeters(double d) {
        return (2.5 * d) / 100;
    }
    public static void showSpeed(double metri, int ore, int minute, int secunde) {
        int numarSecunde = ore * 3600 + minute * 60 + secunde;
        System.out.println("Metri pe secunda: " + metri / numarSecunde);
        double numarOre = ore + minute / 60.0 + secunde / 3600.0;
        System.out.println("Km pe ora: " + metri / 1000 / numarOre);
        System.out.println("Mile pe ora: " + metri / 1609 / numarOre);
    }
}

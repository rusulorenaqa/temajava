package Exercitii;

import java.util.Date;

public class MainExercitii {
    public static void main(String[] args) {
        multiplicationTable(8);
        area(7.5);
        compare(25, 39);
        digits(25);
        computeN(5);
        contBalance(1000, 5, 10);
    }

    public static void multiplicationTable(int a) {
        System.out.println(a * 1);
        System.out.println(a * 2);
        System.out.println(a * 3);
        System.out.println(a * 4);
        System.out.println(a * 5);
    }

    public static void area(double radius) {
        System.out.println(3.14 * radius * radius);
        System.out.println(2 * 3.14 * radius);
    }

    public static void compare(int a, int b) {
        if (a != b) {
            System.out.println(a + "!=" + b);
        }
        if (a < b) {
            System.out.println(a + "<" + b);
        }
        if (a <= b) {
            System.out.println(a + "<=" + b);
        }
    }

    public static void digits(int a) {
        int variabila = a;
        int sumaCifrelor = 0;
        while (variabila != 0) {
            int ultimaCifra = variabila % 10;
            variabila = variabila / 10;
            sumaCifrelor = sumaCifrelor + ultimaCifra;
        }
        System.out.println(sumaCifrelor);
    }

    public static void computeN(int a) {
        int first = a;
        int second = a * 10 + a;
        int third = a * 100 + second;
        System.out.println(first + second + third);
    }

    public static void contBalance(float sumainitiala, float numarani, float dobandaanuala) {
        int sumafinala;
        float numarluni = numarani * 12;
        float dobandalunara = dobandaanuala / 12 / 100;
        while (numarluni != 0) {
            sumainitiala = sumainitiala + sumainitiala * dobandalunara;
            numarluni = numarluni - 1;
            if (numarluni % 12 == 0) {
                System.out.println(sumainitiala);

            }
        }
    }

}




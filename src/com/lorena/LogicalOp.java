package com.lorena;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LogicalOp {
    // ex 3
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else if (first == second) {
            return second;
        } else {
            return second;
        }
    }

    // ex 4
    public String compareText(String text) {
        String fast = "FastTrackIT";
        if (text.equals(fast)) {
            return "Learning text comparison";
        } else {
            return "Got to try some more!";
        }
    }

    // ex 5
    public String compareTextNumber(String a, int b) {
        String text = "FastTrackIT";
        if (a.equals(text) && b <= 3) {
            return a + " " + b;
        } else if (!a.equals(text) && b >= 4) {
            return b + " " + a;
        } else {
            return "Try again!";
        }
    }

    //ex 6
    public String number(int c) {
        if (c > 8 || c == 6) {
            return "The amount of snow this winter was(cm): " + c;
        } else {
            return "The forecast snow is(cm):" + c;
        }
    }

    //ex 7
    public String greater(double d) {
        if (d > 3 && d != 4) {
            return "The number is greater than 3 and not equal to 4:" + d;
        } else if (d == 4) {
            return "The number is equal to 4:" + d;
        } else if (d < 3) {
            return "The number is lower than 3: " + d;
        } else {
            return "Try again!";
        }
    }

    // ex 8
    public void printNumber(int caseNumber) {
        switch (caseNumber) {
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            case 4:
                System.out.println("The number is 4");
                break;
            default:
                System.out.println("Insert a number between 1 and 4");
        }
    }

    // ex 9
    public boolean isNumberEven(double i) {
        return i % 2 == 0;
    }

    //ex 10
    public boolean isEligibleToVote(int v) {
        return v >= 18;
    }

    //ex 11
    public int bigger(int a, int b, int c) {
        int maxim;
        if (a > b) {
            maxim = a;
        } else {
            maxim = b;
        }
        if (c > maxim) {
            maxim = c;
        }
        return maxim;
    }

    public void countHundred(int a) {
        for (int i = a; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void countMinusHundred(int a) {
        for (int i = a; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void countBetween(int a, int b) {
        //a>b
        for (int i = a; i >= b; i--) {
            System.out.println(i);
        }
        //a<b
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    public void countMinToMax(int a, int b) {
        int min;
        int max;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }

    }

    public void countEven() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void countUneven() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public int sumToHundred(int a) {
        int sum = 0;
        for (int i = a; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public float averageToHundred(int a) {
        float sum = 0;
        float count = 0;
        for (int i = a; i <= 100; i++) {
            sum = sum + i;
            count++;
        }
        return sum / count;
    }

    public void show() {
        for (int j = 7; j >= 1; j--) {
            String text = "";
            for (int i = j; i >= 1; i--) {
                text = text + "*";
            }
            System.out.println(text);
        }

    }

    public void countToHundredwhile(int a) {
        while (a <= 100 && a >= 1) {
            System.out.println(a);
            a++;
        }
    }

    public void countToMinusHundredWhile(int a) {
        while (a >= -100) {
            System.out.println(a);
            a--;
        }
    }

    public void countFirstToSecond(int a, int b) {
        while (a <= b) {
            System.out.println(a);
            a++;
        }
        while (a >= b) {
            System.out.println(b);
            b++;
        }
    }

    public void problemaTrei(int a, int b) {
        while (a <= b) {
            System.out.println(a);
            a++;
        }
        while (a >= b) {
            System.out.println(a);
            a--;
        }

    }

    public void problemaCinci() {
        int a = 0;
        while (a <= 100) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }

    public void problemaSase() {
        int a = 0;
        while (a <= 100) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
            a++;
        }

    }

    public void problemaSapte() {
        int min = 111;
        int max = 8899;
        int count = 0;
        int sum = 0;
        while (min <= max) {
            sum = sum + min;
            count = count + 1;
            min++;
        }
        System.out.println(sum);
        System.out.println(sum / count);

    }

    public int problemaOpt(int a, int b) {
        int sum = 0;
        while (a >= b) {
            if (a % 7 == 0) {
                sum = sum + a;
            }
            a--;
        }
        while (a < b) {
            if (a % 7 == 0) {
                sum = sum + a;
            }
            a++;

        }
        return sum;
    }

    public void fibonacci() {
        int a = 0;
        int b = 1;
        int count = 0;
        while (count <= 20) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            count = count + 1;
        }
    }

    public void CozaLozaWoza() {
        int count = 1;
        String text = "";
        int i = 0;
        while (i <= 110) {
            if (count <= 11) {

                if (i % 3 == 0) {
                    text = text + "Coza";
                }
                if (i % 5 == 0) {
                    text = text + "Loza";
                }
                if (i % 7 == 0) {
                    text = text + "Woza";
                }
                if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                    text = text + i;
                }
                text = text + " ";
                count++;
            } else {
                System.out.println(text);
                i = i - 1;
                text = "";
                count = 1;

            }
            i++;

        }
    }

    //ex 2
    public void writeArray() {
        int[] array = new int[100];
        array[0] = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }

    //ex 3
    public int[] evenArray(int[] arrayGol) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                arrayGol[i / 2] = i;
            }
        }
        return arrayGol;
    }

    // ex 4
    public float averageArray(int[] array) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            count = count + 1;
        }
        return sum / count;
    }
    //ex 5

    public boolean verifyArray(String[] array, String name) {
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i])) {
                return true;
            }
        }
        return false;

    }

    //ex 6
    public int position(int[] array, int numar) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numar) {
                return i;
            }
        }
        return -1;
    }

    //ex 7
    public void arrayMatrice() {
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i] = "- ";
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }

    //ex 8
    public int[] sirFaraNumar(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count = count + 1;
                for (int j = i; j < (array.length - 1); j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        int[] arrayNew = new int[array.length - count];
        for (int z = 0; z < arrayNew.length; z++) {
            arrayNew[z] = array[z];
        }
        return arrayNew;
    }

    //ex 9
    public int secondLowest() {
        int[] arr;
        arr = new int[4];
        arr[0] = 4;
        arr[1] = 5;
        arr[2] = 6;
        arr[3] = 2;
        int lowest = arr[0];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (lowest > arr[i]) {
                lowest = arr[i];
            }
        }
        return lowest;
    }


    // ex 10

    public int[] twoArray(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        return array2;
    }

    // tema optionala Java Array
    //ex 1
    public int findSecondLowest(int[] sir) {
        Arrays.sort(sir);
        System.out.println(sir[1]);
        return sir[1];
    }

    //ex 2
    public int[] insertElement(int[] sir, int a, int pozitie) {
        int[] sir2 = new int[sir.length + 1];
        for (int i = 0; i <= sir.length; i++) {
            if (i < pozitie) {
                sir2[i] = sir[i];
            }
            if (i == pozitie) {
                sir2[i] = a;
            }
            if (i > pozitie) {
                sir2[i] = sir[i - 1];
            }
            System.out.println(sir2[i]);
        }
        return sir2;
    }

    //ex 3
    public void findMinMax(int[] sir) {
        int min = sir[0];
        int max = sir[0];
        for (int i = 0; i < sir.length; i++) {
            if (sir[i] < min) {
                min = sir[i];
            }
            if (sir[i] > max) {
                max = sir[i];
            }
        }
        System.out.println(min + " " + max);

    }

    //ex 4
    public int[] reverse(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
            System.out.println(arr2[i]);
        }
        return arr2;
    }

    //ex 5
    public int countDuplicate(int[] sir, int a) {
        int count = 0;
        for (int i = 0; i < sir.length; i++) {
            if (sir[i] == a) {
                count += 1;

            }
        }
        return count;
    }

    public void findAllDuplicates() {
        int[] array = new int[]{4, 5, 5, 5, 9, 9, 9, 3, 3};
        for (int i = 0; i < array.length; i++) {
            if ((countDuplicate(array, array[i])) > 1) {
                System.out.println(array[i]);
            }
        }
    }

    //ex 6
    public void compareArr() {
        int[] sir = new int[]{2, 4, 5, 6, 7, 8};
        int[] sir2 = new int[]{3, 4, 5, 6, 7, 8, 12};
        for (int i = 0; i < sir.length; i++) {
            if ((countDuplicate(sir2, sir[i])) >= 1) {
                System.out.println(sir[i]);
            }
        }

    }


    //ex 7
    public int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    // Tema Liste
    //ex 1
    public void showList(List numelista) {
        numelista.forEach(element -> System.out.println(element));

    }

    //ex 2
    public void addNumber(List numeLista, int a) {
        numeLista.add(a);
        System.out.println(numeLista.toString());
    }

    //ex 3
    public void showFromNumber(List nume, int a) {

        for (int i = nume.indexOf(a); i < nume.size(); i++) {
            System.out.println(nume.get(i));
        }
    }

    //ex 4
    public void reverseList(List nume) {
        for (int i = nume.size() - 1; i >= 0; i--) {
            System.out.println(nume.get(i));
        }
    }

    //ex 5
    public void addNumberForIndex(List<String> nume, int a, String b) {
        nume.add(a, b);
        System.out.println(nume.toString());

    }

    //ex 6
    public void addFirstNumber(List nume, int a) {
        nume.add(0, a);
        System.out.println(nume.toString());
    }

    //ex 7
    public void displayList(List nume) {
        for (int i = 0; i < nume.size(); i++) {
            System.out.println("Pe pozitia " + i + " valoarea este " + nume.get(i));
        }
    }

    //ex 8
    public int returnBiggest(List<Integer> nume) {
        Collections.sort(nume);
        System.out.println(nume.get(nume.size() - 1));
        return nume.get(nume.size() - 1);
    }


}











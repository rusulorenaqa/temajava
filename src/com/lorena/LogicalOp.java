package com.lorena;

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
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //ex 10
    public boolean isEligibleToVote(int v) {
        if (v >= 18) {
            return true;
        } else {
            return false;
        }
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
        int i =0;
        while(i <= 110) {
            if (count <=11) {

                if (i % 3 == 0) {
                    text = text + "Coza";
                }
                if (i % 5 == 0) {
                    text = text + "Loza";
                    ;
                }
                if (i % 7 == 0) {
                    text = text + "Woza";
                }
                if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                    text = text + i;
                }
                text=text+ " ";
                count++;
            } else {
                System.out.println(text);
                i=i-1;
                text="";
                count=1;

            }
            i++;

        }
    }
}











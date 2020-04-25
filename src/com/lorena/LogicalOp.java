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
}






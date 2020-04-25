package com.lorena;
public class Main {
    public static void main(String[] args) {
        Calculator objectCalculator = new Calculator();

        objectCalculator.displaySubstract(2, 3);
        objectCalculator.displaySum(2, 3);
        objectCalculator.displayMultiply(2, 3);
        objectCalculator.displayDivide(2, 3);
        // ex 3
        LogicalOp operatii = new LogicalOp();
        int biggest = operatii.checkBiggerNumber(7, 6);
        System.out.println(" Numarul mai mare este: " + biggest);
        //ex 4
        System.out.println(operatii.compareText("FastTrackI"));
        // ex 5
        System.out.println(operatii.compareTextNumber("FastTrack", 2));
        //ex 6
        System.out.println(operatii.greater(3));
        System.out.println(operatii.greater(4));
        System.out.println(operatii.greater(3.6));
        System.out.println(operatii.greater(2.7));
        //ex 7
        System.out.println(operatii.number(6));
        System.out.println(operatii.number(9));
        System.out.println(operatii.number(8));
        System.out.println(operatii.number(3));
        //ex 8
        operatii.printNumber(15);
        //ex 9
        System.out.println(operatii.isNumberEven(15));
        //ex 10
        System.out.println(operatii.isEligibleToVote(18));
        //ex 11
        System.out.println(operatii.bigger(14, 14, 16));

    }
}
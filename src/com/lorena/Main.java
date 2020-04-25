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
        int biggest = operatii.checkBiggerNumber(6,6);
        System.out.println(" Numarul mai mare este: "+ biggest);
        //ex 4
        operatii.compareText("FastTrackI");
        // ex 5
        operatii.compareTextNumber("FastTrack",2);
        //ex 6
        operatii.greater(3);
        operatii.greater(4);
        operatii.greater(3.6);
        operatii.greater(2.7);
        //ex 7
        operatii.number(6);
        operatii.number(9);
        operatii.number(8);
        operatii.number(3);
        //ex 8
        operatii.printNumber(15);
        //ex 9
        operatii.isNumberEven(15);
        //ex 10
        operatii.isEligibleToVote(18);
        //ex 11
        operatii.bigger(16,15,14);

    }}
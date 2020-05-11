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
        // TEMA FOR
        // ex 1
        operatii.countHundred(35);
        // ex 2
        operatii.countMinusHundred(3);
        // ex 3
        operatii.countBetween(5,3);
        operatii.countBetween(3,5);
        // ex 4
        operatii.countMinToMax(4,6);
        operatii.countMinToMax(6,6);
        //ex 5
        operatii.countEven();
        //ex 6
        operatii.countUneven();
        // ex 7
        System.out.println(operatii.sumToHundred(99));
        //ex 8
        System.out.println(operatii.averageToHundred(97));
        //ex 9
        operatii.show();
        //Tema while
        //ex 1
        operatii.countToHundredwhile(90);
        //ex 2
        operatii.countToMinusHundredWhile(4);
        //ex 3
        operatii.problemaTrei(8,5);
        //ex 4
        operatii.countFirstToSecond(10,2);
        //ex 5
        operatii.problemaCinci();
        //ex 6
        operatii.problemaSase();
        //ex 7
        operatii.problemaSapte();
        //ex 8
        System.out.println(operatii.problemaOpt(3,10));
        //ex 9
        operatii.fibonacci();
        //ex 10
        operatii.CozaLozaWoza();





    }

}
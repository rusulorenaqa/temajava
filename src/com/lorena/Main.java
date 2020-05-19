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

        //tema Arrays
        //ex 1
        objectCalculator.sayHello(3, "Lorena");
        objectCalculator.sum(2,3,4);
        System.out.println(objectCalculator.substract(2,3,4,5));
        System.out.println(objectCalculator.multiply(2,3,4));
        //ex 2
        operatii.writeArray();
        //ex 3
        int [] array = new int[50];
        int[] arrayplin = operatii.evenArray(array);
        for(int i =0; i<50; i++){
            System.out.println(arrayplin[i]);
        }
        //ex 4
        int [] arrayAverage = new int[]{2,3,4};
        float average=operatii.averageArray(arrayAverage);
        System.out.println(average);

        //ex 5
        String [] arrayName= new String[]{"Mihai", "Alin", "Calin"};
        String name=new String("Alin");
        boolean verify=operatii.verifyArray(arrayName, name);
        System.out.println(verify);
        //ex 6
        int [] arrayNumbers=new int[]{2,3,9,5,7,};
        int numar=4;
        int pole=operatii.position(arrayNumbers,numar);
        System.out.println(pole);
        //ex 7
        operatii.arrayMatrice();

        //ex 8
        int [] arrayNr=new int[]{4,6,8,11,14,17,8};
        int number=8;
        int[] arrayNou =operatii.sirFaraNumar(arrayNr,number);
        for(int i =0; i<arrayNou.length; i++){
        System.out.println(arrayNou[i]);}

        // ex 9

        int lowest = operatii.secondLowest();
        System.out.println(lowest);

        // ex 10
        int [] arrayone=new int[]{1,2,3,4,5};
        int [] arraytwo= new int[5];
        int [] arrayBun=operatii.twoArray(arrayone, arraytwo);
        for(int i =0; i<arrayBun.length;i++){
        System.out.println(arrayBun[i]);}

        //Tema optionala Arrays
        //ex 1
        int [] sir = new int[]{3,9,6,7,8,10};
        operatii.findSecondLowest(sir);
        //ex 2
        int [] sirDat= new int[]{3,4,5,6,7,9};
        operatii.insertElement(sirDat, 4, 2);
        //ex 3
        int[] sirSecond = new int[]{4, 5, 1, 2, 5, 7};
        operatii.findMinMax(sirSecond);
        //ex 4
        int [] arr1=new int[]{1,2,3};
        operatii.reverse(arr1);
        //ex 5
        operatii.findAllDuplicates();
        //ex 6
        operatii.compareArr();
        //ex 7
        int [] sirNesort= new int[]{2,5,8,9,3,1};
        int [] sirSortat= operatii.sort(sirNesort);
        for(int i=0; i<sirSortat.length; i++){
            System.out.println(sirSortat[i]);
        }











    }

}
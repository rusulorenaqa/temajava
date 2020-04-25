package com.lorena;

public class LogicalOp {
    public int checkBiggerNumber(int first, int second){
        if(first>second){
            return first;}
        else if(first==second){
            return second;
        }else {return second;}
        }

        public void compareText(String text){
        String fast = "FastTrackIT";
        if(text.equals(fast)){
            System.out.println("Learning text comparison!");
        } else{
            System.out.println("Got to try some more!");
        }}
        public void compareTextNumber(String a, int b){
        String text = "FastTrackIT";
        if(a.equals(text) && b<=3){
            System.out.println(a+ " " +b);}
            else if (!a.equals(text) && b>=4){
                System.out.println(b+" "+a);
            }
            else {
            System.out.println("Try again!");
        }}
        public void number(int c){
        if (c>8||c==6){
            System.out.println("The amount of snow this winter was(cm): "+ c);}
            else{
                System.out.println("The forecast snow is(cm):"+ c); }
        }
        public void greater(double d){
        if (d>3&&d!=4){
            System.out.println("The number is greater than 3 and not equal to 4:"+d );}
            else if(d==4){
            System.out.println("The number is equal to 4:"+d);}
            else if(d<3){
            System.out.println("The number is lower than 3: "+d);}
            else {
            System.out.println("Try again!");
        }
        }
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
                System.out.println("Insert a number between 1 and 4"); }
    }

        public void isNumberEven(double i){
        if(i%2==0){
            System.out.println("True "+ i +" is even");
        }
        else {
            System.out.println("False " + i + " is odd");
        }}
        public void isEligibleToVote(int v){
        if(v>=18){
                System.out.println("True"); }
        else {
            System.out.println("False");
        }}
        public void bigger(int a, int b, int c){
        if(a>b&&a>c){
            System.out.println(a);}
        else if(b>a&&b>c){
            System.out.println(b);}
        else if(c>a&&c>b){
            System.out.println(c);}
        }}








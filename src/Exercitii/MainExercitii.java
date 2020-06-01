package Exercitii;
public class MainExercitii {
    public static void main(String[] args) {
        //ex 1
        System.out.println("Hello "+"Lorena!");
        //ex 2
        int a=2;
        int b=3;
        int sum =a +b;
        System.out.println(sum);
        //ex 3
        float x=10;
        float c=3;
        float impartire=x/c;
        System.out.println(impartire);
        // ex 4
        int d= -5;
        int e= 8;
        int f=6;
        int opreatia1= d+e*f;
        System.out.println(opreatia1);
        float g=55;
        float h=9;
        float operatia2= (g+h)%9;
        System.out.println(operatia2);
        float j=20;
        float k=-3;
        float m=5;
        float n=8;
        float operatia3= j+k*m/n;
        System.out.println(operatia3);
        float z=5;
        float v=15;
        float t=3;
        float r=2;
        float p=8;
        float operatia4=z+v/t*r-p%3;
        System.out.println(operatia4);
        // lab 10
        // ex 2
        Tema1 op = new Tema1();
        op.adunare(2,3);
        op.scadere(2,3);
        op.impartire(2,3);
        op.inmultire(2,3);
        // ex 4
        op.media(2,3,4);
        //ex 6
        op.restImpartire(5,4);
        // ex 7
        op.grade(300);
        // ex 8
        op.inchToMeters(50000);
        //ex 9
        op.viteze(60000, 2,3,45);
        //lab 11
        //ex 3
        op.checkBiggerNumber(5,4);
        //ex 4
        op.compareText("Sapte");
        // ex 5
        op.compareTextAndNr("sapte", 3);
        //ex 6
        op.compareNumbers(4);
        //ex 7
        op.compare(5);
        //ex 9
        op.isNumberEven(9);
        //ex 10
        System.out.println(op.threeNumbers(89,6,9));







}}




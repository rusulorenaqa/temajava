package ConsoleLine;

import com.lorena.Calculator;
import com.lorena.LogicalOp;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator obiectCalculator = new Calculator();
        LogicalOp obiectLogicalOp = new LogicalOp();


        System.out.println("Hello!");
        System.out.println( "Choose an option: \n" +
                "1. Adunare \n" +
                "2. Scadere \n" +
                "3. Inmultire \n" +
                "4. Impartire \n" +
                "5. Media \n" +
                "6. Rest Impartire \n" +
                "7. Cel mai mare numar \n" +
                "8. Media sirului \n" +
                "9. Sortare lista \n" +
                "0. Exit \n");
        int optiuneSelectata = -1;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number: ");
                optiuneSelectata = scanner.nextInt();
                switch (optiuneSelectata){
                    case 1: obiectCalculator.displaySum(23,3);
                        break;
                    case 2: obiectCalculator.displaySubstract(23,3);
                        break;
                    case 3: obiectCalculator.displayMultiply(23,3);
                        break;
                    case 4: obiectCalculator.displayDivide(3,5);
                        break;
                    case 5: obiectCalculator.average(4,6, 5);
                        break;
                    case 6: obiectCalculator.restImpartire(4,5);
                        break;
                    case 7: obiectLogicalOp.bigger(4,56,78);
                        break;
                    case 8: obiectLogicalOp.averageArray(new int [] {3,4,5,6});
                        break;
                    case 9:
                        List listaNumere = new ArrayList <Integer> ();
                        listaNumere.add(2);
                        listaNumere.add(4);
                        listaNumere.add(5);
                        listaNumere.add(6);
                        obiectLogicalOp.sortList(listaNumere);
                    break;

                    }


            }
            catch(InputMismatchException error){
                System.out.println("Please select valid option! ");
            }
        }
        while (optiuneSelectata != 0);
    }

}

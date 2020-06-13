package ConsoleLine;

import com.lorena.Calculator;
import com.lorena.LogicalOp;
import com.lorena.Read;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        login();
    }

    public static void login() {
        int i = 0;
        HashMap<String, String> bazaUseri = new HashMap<>();
        bazaUseri.put("rusu.l@yahoo.com", "treizeci");
        bazaUseri.put("rusu.lo@yahoo.com", "patruzeci");
        bazaUseri.put("rusulorena@yahoo.com", "cincizeci");

        do {

            Read obiectRead = new Read();
            String usernameIntrodus = obiectRead.getString("username");
            String passwordIntrodus = obiectRead.getString("password");

            if (bazaUseri.containsKey(usernameIntrodus) && bazaUseri.get(usernameIntrodus).equals(passwordIntrodus)) {
                mainMenuPrincipal();
                break;
            }
            i = i + 1;
        }
        while (i != 3);
    }

    public static void mainMenuPrincipal() {

        int optiuneselectata = -1;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Choose category: \n" +
                        "1. Calcular \n" +
                        "2. Logical Operations \n" +
                        "0. Exit");
                optiuneselectata = scanner.nextInt();
                switch (optiuneselectata) {
                    case 1:
                        mainMenuCalculator();
                        break;
                    case 2:
                        mainMenuLogicalOperations();
                        break;
                }
            } catch (InputMismatchException error) {
                System.out.println("Please select valid option! ");
            }
        }
        while (optiuneselectata != 0);
    }

    public static void mainMenuCalculator() {
        int optiuneSelectata = -1;
        Calculator obiectCalculator = new Calculator();
        Read obiectRead = new Read();

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Choose an option: \n" +
                        "1. Adunare \n" +
                        "2. Scadere \n" +
                        "3. Inmultire \n" +
                        "4. Impartire \n" +
                        "5. Media \n" +
                        "6. Rest Impartire \n" +
                        "0. Exit");
                optiuneSelectata = scanner.nextInt();
                switch (optiuneSelectata) {
                    case 1:
                        int case11;
                        int case12;
                        case11 = obiectRead.getInt();
                        case12 = obiectRead.getInt();
                        obiectCalculator.displaySum(case11, case12);

                        break;
                    case 2:
                        int case21;
                        int case22;

                        case21 = obiectRead.getInt();
                        case22 = obiectRead.getInt();
                        obiectCalculator.displaySubstract(case21, case22);
                        break;
                    case 3:
                        float case31;
                        float case32;

                        case31 = obiectRead.getFloat();
                        case32 = obiectRead.getFloat();


                        obiectCalculator.displayMultiply(case31, case32);
                        break;
                    case 4:
                        float case41;
                        float case42;

                        case41 = obiectRead.getFloat();
                        case42 = obiectRead.getFloat();


                        obiectCalculator.displayDivide(case41, case42);
                        break;
                    case 5:
                        double case51;
                        double case52;
                        double case53;

                        case51 = obiectRead.getDouble();
                        case52 = obiectRead.getDouble();
                        case53 = obiectRead.getDouble();


                        obiectCalculator.average(case51, case52, case53);
                        break;
                    case 6:
                        int case61;
                        int case62;

                        case61 = obiectRead.getInt();
                        case62 = obiectRead.getInt();


                        obiectCalculator.restImpartire(case61, case62);
                        break;
                }
            } catch (InputMismatchException error) {
                System.out.println("Please select valid option! ");
            }
        }
        while (optiuneSelectata != 0);

    }

    public static void mainMenuLogicalOperations() {
        LogicalOp obiectLogicalOp = new LogicalOp();
        Read obiectRead = new Read();
        int optiuneSelectata = -1;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Choose an option: \n" +
                        "7. Cel mai mare numar \n" +
                        "8. Media sirului \n" +
                        "9. Sortare lista \n" +
                        "0. Exit \n");
                optiuneSelectata = scanner.nextInt();
                switch (optiuneSelectata) {
                    case 7:
                        int case71;
                        int case72;
                        int case73;

                        case71 = obiectRead.getInt();
                        case72 = obiectRead.getInt();
                        case73 = obiectRead.getInt();


                        obiectLogicalOp.bigger(case71, case72, case73);
                        break;
                    case 8:
                        int[] case81;
                        int case82;
                        case82 = obiectRead.getInt();
                        case81 = obiectRead.getArray(case82);


                        obiectLogicalOp.averageArray(case81);
                        break;
                    case 9:
                        int case91;
                        case91 = obiectRead.getInt();
                        List listaNumere = new ArrayList<Integer>();
                        listaNumere = obiectRead.getList(case91);
                        obiectLogicalOp.sortList(listaNumere);
                        break;

                }
            } catch (InputMismatchException error) {
                System.out.println("Please select valid option! ");
            }
        }
        while (optiuneSelectata != 0);
    }


}
// code:
// name:
package bai6_ktra1;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class Main {

    public static void main(String[] args) {
        Bai6 a = null;
        while (true) {
            System.out.println("-------------MENU-------------");
            System.out.println("1.Nhap so nguyen n");
            System.out.println("2.Tinh Pi");
            System.out.println("3.Tinh sin(x)");
            System.out.println("4.Tinh cos(x)");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.");
            System.out.println("8.");
            System.out.println("9.");
            System.out.println("------------------------------");
            System.out.print("Lua chon (0->9):");
            int chon;
            Scanner in = new Scanner(System.in);
            chon = Integer.parseInt(in.nextLine());
            switch (chon) {
                case 0:
                    System.out.println("bye, good luck!!!");
                    System.exit(0);
                case 1:
                    a = new Bai6();
                    break;
                case 2:
                    a.tinhPi();
                    break;
                case 3:
                    a.tinhSin();
                    break;
                case 4:
                    a.tinhCos();
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    break;
                case 8:
                    System.out.println("8");
                    break;
                case 9:
                    System.out.println("9");
                    break;
                default:
                    System.out.println("Chon tu 1->9 thoi bro =)))");
            }
        }
    }
}

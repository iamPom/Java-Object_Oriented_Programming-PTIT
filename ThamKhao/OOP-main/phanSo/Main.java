
package javaapplication2;

import java.util.Scanner;

/**
 * @author JohnLark
 */
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fraction a = new Fraction();
        Fraction b = new Fraction();
        Fraction res = new Fraction();
        boolean i = true;
        while (i) {
            System.out.println("============MENU===========");
            System.out.println("1. Nhap phan so 1");
            System.out.println("2. Nhap phan so 2");
            System.out.println("3. Cong");
            System.out.println("4. Tru");
            System.out.println("5. Nhan");
            System.out.println("6. Chia");
            System.out.println("Press others buttons to exit.");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    a.nhap();
                    break;
                case 2:
                    b.nhap();
                    break;
                case 3:
                    res.add(a, b).printFraction();
                    break;
                case 4:
                    res.subtract(a, b).printFraction();
                    break;
                case 5:
                    res.multiply(a, b).printFraction();
                    break;
                case 6:
                    res.devide(a, b).printFraction();
                    break;
                default:
                    i = false;
                    break;
            }
        }
    }

}

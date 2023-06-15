// code:
// name:
package bai6_ktra1;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class Bai6 {

    private double epsilon;
    Scanner sc = new Scanner(System.in);

    public Bai6() {

        System.out.print("Nhap epsilon: ");
        epsilon = Double.parseDouble(sc.nextLine());
    }

    public void tinhPi() {
        double pi = 0;
        long n = 0;
        double x = 1.0 / (n * 2 + 1);
        while (epsilon <= x) {
            pi += Math.pow(-1, n) * x;
            n++;
            x = 1.0 / (n * 2 + 1);
        }
        pi *= 4;
        System.out.println("PI = " + pi);
    }

    public static long factorial(long number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public void tinhSin() {
        System.out.print("nhap x: ");
        double x = Double.parseDouble(sc.nextLine());
        double s = 0, s1 = 0, s2 = 0;
        x = Math.toRadians(x);
        long i = 0;
        do {
            s1 = s2;
            s += ((Math.pow(-1, i) * Math.pow(x, 2 * i + 1)) / factorial(2 * i + 1));
            s2 = s;
            i++;
        } while (Math.abs(s2 - s1) >= epsilon);
        System.out.println("sin(x) = " + s2);
    }
    
    public void tinhCos() {
        System.out.print("nhap x: ");
        double x = Double.parseDouble(sc.nextLine());
        double s = 0, s1 = 0, s2 = 0;
        x = Math.toRadians(x);
        long i = 0;
        do {
            s1 = s2;
            s += ((Math.pow(-1, i) * Math.pow(x, 2 * i)) / factorial(2 * i));
            s2 = s;
            i++;
        } while (Math.abs(s2 - s1) >= epsilon);
        System.out.println("cos(x) = " + s2);
    }
}

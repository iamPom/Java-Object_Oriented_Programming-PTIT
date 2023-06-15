// code:    J01011
// name:    GCD LCM
package basicJava;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B5_GCDvaLCM {

    public static long GCD(long a, long b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    public static long LCM(long a, long b) {
        return (a * b) / GCD(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t > 0) {
            long a = scanner.nextLong(), b = scanner.nextLong();
            System.out.println(LCM(a, b) + " " + GCD(a, b));
            t--;
        }
    }

}

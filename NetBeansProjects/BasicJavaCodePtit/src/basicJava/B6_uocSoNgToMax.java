// code:    J01014
// name:
package basicJava;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B6_uocSoNgToMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t > 0) {
            long n = scanner.nextLong();
            while (n % 2 == 0) {
                n /= 2;
            }
            if (n == 1) {
                System.out.println(2);
                t--;
                continue;
            }
            for (long i = 3; i <= Math.sqrt(n); i += 2) {
                while (n % i == 0) {
                    n /= i;
                }
                if (n == 1) {
                    System.out.println(i);
                }
            }
            if (n > 1) {
                System.out.println(n);
            }
            t--;
        }
    }
}

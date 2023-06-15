// code:	J01006
// name:        so fibo
package basicJava;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B3_soFibo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t > 0) {
            long n = scanner.nextLong();
            long f0 = 0, f1 = 1, fn = 0;
            for (long i = 1; i < n; i++) {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
            }
            System.out.println(fn);
            t--;
        }
    }
}

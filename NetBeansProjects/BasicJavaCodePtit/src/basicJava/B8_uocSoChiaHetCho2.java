// code:
// name:
package basicJava;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B8_uocSoChiaHetCho2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t > 0) {
            long n = scanner.nextLong(), count = 1;
            if (n % 2 == 1) {
                System.out.println(0);
            } else {
                long a = (long) Math.sqrt(n);
                for (long i = 2; i <= a; i++) {
                    if (n % i == 0) {
                        if (i % 2 == 0) {
                            count++;
                        }
                        if ((n / i) % 2 == 0) {
                            count++;
                        }
                    }
                }
                if (a * a == n) {
                    count--;
                }
                System.out.println(count);
            }
            t--;
        }
    }
}

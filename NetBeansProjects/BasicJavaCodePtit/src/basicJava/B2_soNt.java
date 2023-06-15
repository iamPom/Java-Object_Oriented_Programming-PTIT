// code:    	J01004
// name:        Số nguyên tố
package basicJava;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B2_soNt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int a = scanner.nextInt();
            if (isPrime(a)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

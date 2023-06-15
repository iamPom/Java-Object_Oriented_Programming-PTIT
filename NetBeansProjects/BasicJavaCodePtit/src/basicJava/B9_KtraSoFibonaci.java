// code:
// name:
package basicJava;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B9_KtraSoFibonaci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t > 0) {
            long n = scanner.nextLong();
            boolean check = false;
            if (n == 0) {
                System.out.println("YES");
                t--;
                continue;
            }
            long f0 = 0, f1 = 1, fn = 0;
            for (long i = 1; fn <= n; i++) {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
                if (fn == n) {
                    check = true;
                    break;
                }
            }
            if (check == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}

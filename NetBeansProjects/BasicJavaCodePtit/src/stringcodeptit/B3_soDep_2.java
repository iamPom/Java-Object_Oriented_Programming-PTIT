// code:
// name:
package stringcodeptit;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B3_soDep_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-- > 0) {
            String s;
            s = scanner.next();
            int n = s.length();
            char[] a = new char[n];
            a = s.toCharArray();
            if (a[0] != '8' || a[n - 1] != '8') {
                System.out.println("NO");
                continue;
            }
            long sum = 0;
            boolean check = true;
            for (int i = 0; i <= n / 2; i++) {
                if (a[i] != a[n - i - 1]) {
                    check = false;
                    break;
                }
            }
            if (check == false) {
                System.out.println("NO");
                continue;
            }
            for (int i = 0; i < n; i++) {
                sum += (a[i] - '0');
            }
            if (sum % 10 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

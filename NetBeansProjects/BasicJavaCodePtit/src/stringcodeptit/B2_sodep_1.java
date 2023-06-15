// code:
// name:
package stringcodeptit;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B2_sodep_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s;
            s = scanner.next();
            int n = s.length();
            char[] a = new char[n];
            a = s.toCharArray();
            if (n % 2 == 1) {
                if ((a[n / 2 + 1] - '0') % 2 == 1) {
                    System.out.println("NO");
                    continue;
                }
            }
            boolean check = true;
            for (int i = 0; i <= n / 2; i++) {
                if (a[i] != a[n - i - 1] || ((a[i] - '0') % 2 == 1)) {
                    System.out.println("NO");
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("YES");
            }
        }
    }
}

// code:
// name: mang doi xung
package arraycodeptit;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B1_mangDoiXung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(), n;
        int[] a;
        while (t-- > 0) {
            n = scanner.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            boolean check = true;
            for (int i = 0; i < n / 2; i++) {
                if (a[i] != a[n - i - 1]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

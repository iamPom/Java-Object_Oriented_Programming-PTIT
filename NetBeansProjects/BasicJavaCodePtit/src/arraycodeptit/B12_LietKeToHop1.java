// code:
// name:
package arraycodeptit;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B12_LietKeToHop1 {

    public static int[] a = new int[20];
    public static int n, k;
    static boolean check=true;
    static void xuat() {
        for (int i = 1; i <= k; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }

    static void sinh() {
        int i = k;
        while (a[i] == n - k + i) {
            i--;
        }
        a[i]++;
        if (i > 0) {
            for (int j = i + 1; j <= k; j++) {
                a[j] = a[j - 1] + 1;
            }
        } else {
            check = false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        for (int i = 1; i <= k; i++) {
            a[i] = i;
        }
        check = true;
        int count =0;
        while (check) {
            xuat();
            sinh();
            count++;
        }
        System.out.println("\nTong cong co "+count+" to hop");
    }
}

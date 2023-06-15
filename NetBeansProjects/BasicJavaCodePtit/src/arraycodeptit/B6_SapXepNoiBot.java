// code:
// name:
package arraycodeptit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B6_SapXepNoiBot {

    public static void xuat(int[] a, int i) {
        System.out.print("Buoc " + (i + 1) + ": ");
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(b);

        for (int i = 0; i < n; i++) {
            
            if (Arrays.equals(a, b)) {
                break;
            }

            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    continue;
                }
            }xuat(a, i);
        }
    }
}

// code:    J02012
// name:
package arraycodeptit;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Pom
 */
public class B5_SapXepChen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Buoc " + b + ": ");
            Arrays.sort(a, 0, i+1);
            for (int j = 0; j <= b; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println("");
            b++;
        }
    }
}

// code:    J02010
// name:    sap xep doi cho truc tiep
package arraycodeptit;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B3_SxDoiChoTrucTiep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), d = 1;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print("Buoc " + d + ": ");
            d++;
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println("");
        }
    }
}

// code:    J02011 
// name:    sap xep chon
package arraycodeptit;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B4_SxChon {

    static void xuat(int[] a, int i) {
        System.out.print("Buoc " + (i + 1) + ": ");
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
            xuat(a, i);
        }
    }

}

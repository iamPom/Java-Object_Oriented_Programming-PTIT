// code:    J02105
// name:
package arraycodeptit;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B11_danhSachKe {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("List("+(i+1)+") = ");
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    System.out.print(j+1+" ");
                }
            }System.out.println("");
        }
    }
}

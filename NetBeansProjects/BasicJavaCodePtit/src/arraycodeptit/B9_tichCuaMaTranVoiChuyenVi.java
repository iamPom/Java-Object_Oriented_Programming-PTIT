// code:    J02103
// name:
package arraycodeptit;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B9_tichCuaMaTranVoiChuyenVi {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt(), test = 1;
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            int[][] c = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            System.out.println("Test " + test + ":");
            test++;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(c[j][k] + " ");
                }
                System.out.println("");
            }
        }
    }
}

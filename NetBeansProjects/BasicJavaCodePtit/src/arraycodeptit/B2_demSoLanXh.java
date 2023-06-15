// code:    J02007
// name:    dem so lan xuat hien
package arraycodeptit;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B2_demSoLanXh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int d=1;
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] ok = new int[100005];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                ok[a[i]]++;
            }
            System.out.println("Test "+d+": ");
            d++;
            for (int i = 0; i < n; i++) {
                if (ok[a[i]]>0) {
                    System.out.println(a[i]+" xuat hien "+ ok[a[i]]+" lan");
                    ok[a[i]]=0;
                }
            }
        }
    }
}

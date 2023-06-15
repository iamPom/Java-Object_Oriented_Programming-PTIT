// code:
// name:
package arraycodeptit;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B8_DiemCanBang {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n], b = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(i==0){
                    b[0]=a[0];
                } else{
                    b[i]=b[i-1]+a[i];
                }
            }
            boolean check = true;
            for (int i = 1; i < n; i++) {
                if ((b[n-1] - a[i]) % 2 == 1) {
                    continue;
                }
                if (b[i-1] == (b[n-1] - a[i]) / 2) {
                    check = false;
                    System.out.println(i + 1);
                    break;
                }
            }
            if (check) {
                System.out.println(-1);
            }
        }
    }
}

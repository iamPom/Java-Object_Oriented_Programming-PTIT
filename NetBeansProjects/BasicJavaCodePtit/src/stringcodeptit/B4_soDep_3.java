// code:    	J03008
// name:
package stringcodeptit;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B4_soDep_3 {

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s;
            s = scanner.next();
            int n = s.length();
            char[] a = new char[n];
            a = s.toCharArray();
            boolean check = true;
            for (int i = 0; i <= n / 2; i++) {
                if (a[i] != a[n - i - 1]||!isPrime(a[i]-'0')) {
                    check = false;
                    break;
                }
            }
            if (check == false) {
                System.out.println("NO");
            } else{
                System.out.println("YES");
            }
        }
    }

}

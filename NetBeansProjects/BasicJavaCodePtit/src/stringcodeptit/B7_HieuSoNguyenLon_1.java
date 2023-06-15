// code:
// name:
package stringcodeptit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B7_HieuSoNguyenLon_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s1 = scanner.next(), s2 = scanner.next();
            int max = Math.max(s1.length(), s2.length());
            BigInteger num1 = new BigInteger(s1);
            BigInteger num2 = new BigInteger(s2);
            String res = num1.subtract(num2).abs().toString();
            for (int i = 0; i < (max - res.length()); i++) {
                System.out.print(0);
            }
            System.out.println(res);
        }
    }
}

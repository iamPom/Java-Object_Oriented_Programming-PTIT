// code:    J01021
// name:
package basicJava;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B14_tinhLuythua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 20;
        while (t-- > 0) {
            Long a, b;
            a = scanner.nextLong();
            b = scanner.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            BigInteger num1 = new BigInteger(a.toString());
            BigInteger num2 = new BigInteger(b.toString());
            BigInteger modulo = new BigInteger("1000000007");
            BigInteger res = num1.modPow(num2, modulo);
            System.out.println(res);
        }
    }
}

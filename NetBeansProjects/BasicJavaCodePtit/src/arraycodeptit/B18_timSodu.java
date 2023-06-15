// code:
// name:
package arraycodeptit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B18_timSodu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            BigInteger mu = new BigInteger(scanner.next());
            BigInteger modulo = new BigInteger("5");
            BigInteger m1 = new BigInteger("1");
            BigInteger m2 = new BigInteger("2");
            BigInteger m3 = new BigInteger("3");
            BigInteger m4 = new BigInteger("4");
            BigInteger res = (m1.modPow(mu, modulo));
            res= res.add(m2.modPow(mu, modulo));
            res= res.add(m3.modPow(mu, modulo));
            res= res.add(m4.modPow(mu, modulo));
            res= res.mod(modulo);
            System.out.println(res);
        }
    }
}

// code:    	J03011
// name:
package stringcodeptit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B1_uocChungLonNhatCuaSoNguyenLon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            BigInteger num1 = new BigInteger(scanner.next());
            BigInteger num2 = new BigInteger(scanner.next());
            System.out.println(num1.gcd(num2));
        }
    }
}

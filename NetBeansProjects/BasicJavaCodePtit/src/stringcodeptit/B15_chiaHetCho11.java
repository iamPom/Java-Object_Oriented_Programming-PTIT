// code:    	J03016
// name:
package stringcodeptit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B15_chiaHetCho11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            BigInteger num = new BigInteger(scanner.next());
            BigInteger i = new BigInteger("1");
            
            System.out.println(num.intValue());
            Long a = num.mod(i).longValue();
//            if (a==0) {
//                System.out.println("1");
//            } else {
//                System.out.println("0");
//            }
        }
    }
}

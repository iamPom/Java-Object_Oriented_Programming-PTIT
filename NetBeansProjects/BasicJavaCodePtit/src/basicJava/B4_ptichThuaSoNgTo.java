// code:    	J01008
// name:        phan tich thua so nguyen to
package basicJava;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B4_ptichThuaSoNgTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        long test =0;
        while (t > 0) {
            long n = scanner.nextLong();
            long count = 0;
            test++;
            System.out.print("Test " + test + ":");
            while (n % 2 == 0 && n > 0) {
                count++;
                n /= 2;
            }
            if (count > 0) {
                System.out.print(" 2(" + count + ") ");
            }
            for (long i = 3; i < Math.sqrt(n); i += 2) {
                count = 0;
                while (n % i == 0) {
                    count++;
                    n /= i;
                }
                if (count > 0) {
                    System.out.print(" "+i + "(" + count + ") ");
                }
            }
            if (n > 1) {
                System.out.print(" "+ n + "(1)");
            }
            System.out.println("");
            t--;
        }

    }
}

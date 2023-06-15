// code:    J01002
// name:    Tinh tong
package basicJava;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B12_tinhTong {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long t = scan.nextLong();
        while (t > 0) {
            long n = scan.nextLong(), sum = 0;
            if (n % 2 == 0) {
                sum = (n + 1) * (n / 2);
            } else {
                sum = (n + 1) * (n / 2) + (n+1) / 2;
            }
            System.out.println(sum);
            t--;
        }
    }
}

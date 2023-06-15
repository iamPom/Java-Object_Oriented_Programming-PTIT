// code:
// name:
package basicJava;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B7_2_tongUocSo2 {

    public static long count = 0;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long[] TongUoc = new long[2000001];
        for (int i = 2; i <= 2000000; i++) {
            if (TongUoc[i] != 0) {
                continue;
            }
            for (int j = i; j <= 2000000; j += i) {
                int tmp = j;
                while (tmp % i == 0) {
                    TongUoc[j] += i;
                    tmp /= i;
                }
            }
        }
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int count1=0;
        for (int i = a; i <= b; i++) {
            if (TongUoc[i] > i) {
                count1+=3;
            }
            System.out.print(Math.sqrt(12));
        }
        System.out.println(count1);
    }
}

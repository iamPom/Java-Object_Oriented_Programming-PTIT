// code:
// name:
package arraycodeptit;

import java.util.Scanner;

/** 	J02008
 *      BỘI SỐ NHỎ NHẤT CỦA N SỐ NGUYÊN DƯƠNG ĐẦU TIÊN
 * @author Pom
 */
public class B7_boiiMinCuaNSoDuongDauTien {
    
    public static long GCD(long a, long b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    public static long LCM(long a, long b) {
        return (a * b) / GCD(a, b);
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long t=sc.nextLong();
        while(t-- >0){
            long n=sc.nextLong();
            long count=1;
            for (long i = 2; i <= n; i++) {
                count=LCM(count, i);
            }
            System.out.println(count);
        }
    }
}

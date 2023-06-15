// code:	J01001
// name:        hình chữ nhật
package basicJava;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B10_hinhChuNhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println("0");
        } else {
            int dtich = a * b, cvi = (a + b) * 2;
            System.out.println(cvi + " " + dtich);
        }
    }
}

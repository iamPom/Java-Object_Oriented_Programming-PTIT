// code:    	J01003
// name:
package basicJava;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B11_ptBacNhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong(), b = scanner.nextLong();
        if (a == 0 && b != 0) {
            System.out.println("VN");
        } else {
            if (a == 0 && b == 0) {
                System.out.println("VSN");
            } else {
                float c = (float) (-b) / (float) a;
                System.out.printf("%.2f", c);
            }
        }
    }
}

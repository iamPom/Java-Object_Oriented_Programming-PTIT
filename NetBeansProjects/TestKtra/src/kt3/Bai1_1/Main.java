
package kt3.Bai1_1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CountDown t1 = new CountDown(n);
        ColorRun t2 = new ColorRun(n);
        t1.start();
        t2.start();
    }
}

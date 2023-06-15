// code:
// name:
package ToHop1;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        HoanVi hv = new HoanVi(n);
        hv.init(n);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        System.out.println("");
        System.out.print("Nhap k: ");
        int k = sc.nextInt();
        ToHop th = new ToHop(k, n);
        th.init();
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        NhiPhan np = new NhiPhan(n);
        np.inti();
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        System.out.println("");
        System.out.print("Nhap k: ");
        k = sc.nextInt();
        ChinhHop cp = new ChinhHop(n,k);
        cp.init();
    }
}

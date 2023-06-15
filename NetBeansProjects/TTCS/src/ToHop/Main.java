// code:
// name:
package ToHop;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tinh hoan vi:\nNhap n: ");
        int n = sc.nextInt();
        HoanVi hv = new HoanVi(n);
        hv.init(n);
        
        System.out.print("Tinh To Hop:\nNhap n: ");
        n = sc.nextInt();
        System.out.println("");
        System.out.print("Nhap k: ");
        int k = sc.nextInt();
        ToHop th = new ToHop(k, n);
        th.init();
        
        System.out.print("Tinh Nhi Phan:\nNhap n: ");
        n = sc.nextInt();
        NhiPhan np = new NhiPhan(n);
        np.inti();
        
        System.out.print("Tinh Chinh Hop:\nNhap n: ");
        n = sc.nextInt();
        System.out.println("");
        System.out.print("Nhap k: ");
        k = sc.nextInt();
        ChinhHop cp = new ChinhHop(n,k);
        cp.init();
    }
}

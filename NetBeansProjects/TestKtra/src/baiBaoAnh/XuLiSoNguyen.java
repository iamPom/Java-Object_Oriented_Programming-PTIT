package baiBaoAnh;

import java.util.Scanner;

public class XuLiSoNguyen {

    private int n;
    private int[] x = new int[100];
    private boolean[] check = new boolean[100];

    public XuLiSoNguyen() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong n: ");
        n = Integer.parseInt(in.nextLine());
    }

    public void SoChan3() {
        System.out.print("Cac so chan chia het cho 3 nho hon " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    private void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (!check[j]) {
                x[i] = j;
                check[j] = true;
                if (i == n) {
                    for (int k = 1; k <= n; k++) {
                        System.out.print(x[k]);
                    }
                    System.out.print(" ");
                } else {
                    Try(i + 1);
                }
                check[j] = false;
            }
        }
    }

    public void HoanVi() {
        Try(1);
        System.out.println("");
    }
}

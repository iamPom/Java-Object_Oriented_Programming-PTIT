package baiBaoAnh;


import java.util.Scanner;

public class DaThuc {

    private int[] a;

    public DaThuc() {

    }

    public void nhap() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap bac cua da thuc: ");
        int n = Integer.parseInt(in.nextLine());
        a = new int[n + 1];
        for (int i = n; i >= 0; i--) {
            System.out.print("Nhap he so co so mu " + i + ": ");
            a[i] = Integer.parseInt(in.nextLine());
        }
    }

    public void viet() {

        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] != 0) {
                System.out.print("(" + a[i] + "*x^" + i + ")" + "+");
            }
        }
        if (a[0] < 0) {
            System.out.print("(" + a[0] + ")");
        } else if (a[0] > 0) {
            System.out.print(a[0]);
        }
        System.out.println("");
    }

    public void tinh() {
        System.out.print("Gia tri cua da thuc tai x=1 la:");
        int s = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            s += a[i];
        }
        System.out.println(s);
    }

    public DaThuc DaoHam() {
        System.out.print("Dao ham: ");
        int[] a1 = new int[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a1[i - 1] = a[i] * i;
        }
        DaThuc k = new DaThuc();
        k.setDaThuc(a1);
        return k;
    }

    public int[] getDaThuc() {
        return a;
    }

    public void setDaThuc(int[] a) {
        this.a = a;

    }
}

package ktra1;


import java.util.Scanner;

public class SoNguyen {

    Scanner sc = new Scanner(System.in);
    private int n;

    public SoNguyen() {
        System.out.print("Nhap vao n: ");
        n = Integer.parseInt(sc.nextLine());
    }

    public void uocSoN() {
        System.out.print("Uoc nguyen to nho hon n: ");
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0 && isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public void Fibo() {
        int a = n;
        long f0 = 0, f1 = 1, fn = 1;
        System.out.print("So fibo nho hon n: ");
        for (long i = 1; fn < a; i++) {
            System.out.print(fn + " ");
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;

        }
        System.out.println("");
    }

}

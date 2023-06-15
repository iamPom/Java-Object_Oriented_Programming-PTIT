package demo;


import java.util.Scanner;

// code:
// name:
/**
 *
 * @author Pom
 */
class bai1 {

    Scanner sc = new Scanner(System.in);
    private int n;
    private int digit = 1;
    private int[] x = new int[100];

    public bai1() {
        System.out.print("Nhap vao n: ");
        n = Integer.parseInt(sc.nextLine());
    }

    public void tong() {

        int sum = (n * (n + 1)) / 2;
        System.out.println("Tong la: " + sum);
    }

    public void tich() {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        System.out.println("Tich can tim: " + res);
    }

    public void sumchan() {
        int res = 0;
        for (int i = 2; i <= n; i += 2) {
            res += i;
        }
        System.out.println("Tong can");
    }

    public void sumle() {
        for (int i = 1; i <= n; i += 2) {
            digit += i;
        }
        digit = digit - 1;
    }

    public void sumchiahetcho3() {
        for (int i = 3; i <= n; i += 3) {
            digit += i;
        }
        digit = digit - 1;
    }

    public void sumchiahetcho3va5() {
        for (int i = 15; i <= n; i += 15) {
            digit += i;
        }
        digit = digit - 1;
    }

    public int prime(int x) {
        if (n < 2) {
            return 0;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return 0;
                }
            }
            return 1;
        }
    }

    public void isprime() {
        for (int i = 2; i <= n; i++) {
            if (prime(i) == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public void uocsonto() {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && prime(i) == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public void in(int x[]) {
        for (int i = 1; i <= n; i++) {
            System.out.print(x[i]);
        }
        System.out.println("");

    }

    public void nhiPhan(int i) {
        for (int j = 0; j <= 1; j++) {
            x[i] = j;
            if (i == n) {
                in(x);
            } else {
                nhiPhan(i + 1);
            }
        }
    }

    public void Fibo() {
        int a = n;
        long f0 = 0, f1 = 1, fn = 1;
        System.out.print("So fibo nho hon n: ");
        for (long i = 1; fn <= a; i++) {
            System.out.print(fn + " ");
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;

        }
        System.out.println("");
    }

    @Override
    public String toString() {
        return String.format("so do la : %d", digit);

    }
}

class bai2 {
    Scanner sc = new Scanner(System.in);
    private int n;
    private int digit = 0;

    public bai2() {
        System.out.print("Nhap vao n: ");
        n = Integer.parseInt(sc.nextLine());
    }

    public void tongchuso() {
        while (n != 0) {
            digit += n % 10;
            n /= 10;
        }
    }

    public void thuasonto() {
        System.out.print(n+" = ");
        int a=n;
        for (int i = 2; i <= a; i++) {
            while (a % i == 0) {
                if (i == a) {
                    System.out.print(i);
                }else{
                    System.out.print(i + " x ");
                }
                a = a / i;
                
            }
        }
        System.out.println("");
    }

    public void sothuannghic() {
        int a = n;
        int b=1;
        while (a != 0) {
            b *= 10;
            b += a % 10;
            a /= 10;
        }
        if (n == b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    @Override
    public String toString() {
        return String.format("so do la : %d", digit);
    }
}

class bai3 {

    private int m;
    private int n;
    private int digit = 0;

    public bai3() {

    }

    public bai3(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }

    public int prime(int x) {
        if (n < 2) {
            return 0;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return 0;
                }
            }
            return 1;
        }
    }

    public void insto() {
        for (int i = m; i <= n; i++) {
            if (prime(i) == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public int sothuannghic(int x) {
        int a = x;
        int y = 0;
        while (a != 0) {
            y *= 10;
            y += a % 10;
            a /= 10;
        }
        if (y == x) {
            return 1;
        }
        return 0;
    }

    public void insothuannghic() {
        for (int i = m; i <= n; i++) {
            if (sothuannghic(i) == 1) {
                System.out.print(i + " ");
            }
        }
    }

    @Override
    public String toString() {
        return String.format("so do la : %d", gcd(m, n));
    }
}

class bai4 {

    private double a;
    private double b;
    private double c;
    private double digit;

    public bai4() {

    }

    public bai4(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void dientich() {
        digit = 0.25 * (Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c)));
        System.out.print(digit);
    }

    public void chuvi() {
        digit = 8 * (a + b + c);
        System.out.print(digit);
    }

    public void dientichhinhop() {
        digit = 2 * a * c + 2 * b * c + 2 * a * b;
        System.out.print(digit);
    }
}

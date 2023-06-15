import java.util.Scanner;

class bai1 {
    private int n;
    private int digit = 1;

    // private int sum=0;
    // private int sum=0;
    public bai1() {

    }

    public bai1(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void tong() {
        digit = (n * (n + 1)) / 2;
    }

    public void tich() {
        for (int i = 1; i <= n; i++)
            digit *= i;
    }

    public void sumchan() {
        for (int i = 2; i <= n; i += 2) {
            digit += i;
        }
        digit = digit - 1;
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
        if (n < 2)
            return 0;
        else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0)
                    return 0;
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

    @Override
    public String toString() {
        return String.format("so do la : %d", digit);
    }
}

class bai2 {
    private int n;
    private int digit = 0;

    public bai2() {

    }

    public bai2(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void tongchuso() {
        while (n != 0) {
            digit += n % 10;
            n /= 10;
        }
    }

    public void thuasonto() {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.print(i + " ");
            }
        }
    }

    public void sothuannghic() {
        int a = n;
        while (a != 0) {
            digit *= 10;
            digit += a % 10;
            a /= 10;
        }
        if (n == digit) {
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
        if (n < 2)
            return 0;
        else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0)
                    return 0;
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
        if (y == x)
            return 1;
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
        digit = 8*(a+b+c);
        System.out.print(digit);
    }
    public void dientichhinhop() {
        digit =2*a*c+2*b*c+2*a*b;
        System.out.print(digit);
    } 
}
public class thuchanh1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t=sc.nextInt();
        // switch(t){
        // case(1):
        // bai1 obj=new bai1();
        // obj.setN(sc.nextInt());
        // obj.tong();
        // // obj.tich();
        // // obj.sumchan();
        // // obj.sumle();
        // // obj.sumchiahetcho3();
        // // obj.sumchiahetcho3va5();
        // // obj.isprime();
        // // obj.uocsonto();
        // System.out.println(obj);
        // case(2):
        // bai2 obj2=new bai2();
        // obj2.setN(sc.nextInt());
        // // obj2.tongchuso();
        // // obj2.thuasonto();
        // // obj2.sothuannghic();
        // // System.out.println(obj2);
        // case(3):
        // bai3 obj3=new bai3();
        // obj3.setM(sc.nextInt());
        // obj3.setN(sc.nextInt());
        // obj3.insto();
        // obj3.insothuannghic();
        // System.out.println(obj3);
        // case(4):
        // }

        sc.close();
    }
}
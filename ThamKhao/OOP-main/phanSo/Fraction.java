package javaapplication2;

import java.util.Scanner;

public class Fraction {
    private int ts;
    private int ms;

    Scanner scanner = new Scanner(System.in);

    public void setTs(int ts) {
        this.ts = ts;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public Fraction() {

    }

    public void nhap() {
        System.out.println("Tu so= ");
        int ts = scanner.nextInt();
        this.setTs(ts);
        System.out.println("Mau so= ");
        int ms = scanner.nextInt();
        this.setMs(ms);

    }

    public Fraction add(Fraction a, Fraction b) {
        Fraction res = new Fraction();
        a = a.simplify();
        b = b.simplify();
        int u = ucln(a.ms, b.ms);
        int bcnn = a.ms * b.ms / u;
        res.setTs(a.ts * (bcnn / a.ms) + b.ts * (bcnn / b.ms));
        res.setMs(bcnn);
        res.simplify();
        return res;
    }

    public Fraction subtract(Fraction a, Fraction b) {
        Fraction res = new Fraction();
        a = a.simplify();
        b = b.simplify();
        int u = ucln(a.ms, b.ms);
        int bcnn = a.ms * b.ms / u;
        res.setTs(a.ts * (bcnn / a.ms) - b.ts * (bcnn / b.ms));
        res.setMs(bcnn);
        res.simplify();
        return res;
    }

    public Fraction multiply(Fraction a, Fraction b) {
        Fraction res = new Fraction();
        a = a.simplify();
        b = b.simplify();
        res.setTs(a.ts * b.ts);
        res.setMs(a.ms * b.ms);
        res.simplify();
        return res;
    }

    public Fraction devide(Fraction a, Fraction b) {
        Fraction res = new Fraction();
        a = a.simplify();
        b = b.simplify();
        res.setTs(a.ts * b.ms);
        res.setMs(a.ms * b.ts);
        res.simplify();
        return res;
    }

    public Fraction simplify() {
        Fraction simplifiedFraction = new Fraction();
        int flag = 1;
        if (this.ts * this.ms < 0) flag = -1;
        int u = ucln(this.ts, this.ms);
        simplifiedFraction.ts = Math.abs(this.ts) * flag / u;
        simplifiedFraction.ms = Math.abs(this.ms) / u;
        return simplifiedFraction;
    }

    public void printFraction() {
        if (this.ts % this.ms == 0) System.out.println(this.ts / this.ms);
        else System.out.println(this.ts + "/" + this.ms);
    }

    private static int ucln(int a, int b) {
        while (a * b != 0) {
            if (a > b) a %= b;
            else b = b % a;
        }

        return a + b;
    }
}

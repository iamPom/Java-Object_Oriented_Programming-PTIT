package bai8_ktra1;

import java.util.*;

public class bai8 {

    private double[] a;
    private double n;

    public bai8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu : ");
        n = sc.nextDouble();
        a = new double[(int)n + 1];
        System.out.print("nhap cac ptu: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
    }

    public int countElement(double a[], double n, double i) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (a[j] == i) {
                count++;
            }
        }
        return (count);
    }

    public void lietke() {
        for (int i = 0; i < n; i++) {
            if (countElement(a, n, a[i]) == 1) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public void demsolan() {
        LinkedHashMap<Double, Double> linkedHashMap = new LinkedHashMap<Double, Double>();
        for (int i = 0; i < n; i++) {
            if (linkedHashMap.containsKey(a[i])) {
                linkedHashMap.put(a[i], linkedHashMap.get(a[i]) + 1);
            } else {
                linkedHashMap.put(a[i], 1.0);
            }
        }
        for (Map.Entry<Double, Double> key : linkedHashMap.entrySet()) {
            System.out.println(String.format("%.1f xuat hien %.0f lan", key.getKey(), key.getValue()));
        }
    }

    public int checktang() {
        for (int i = 0; i < n - 1; i++) {
            if (a[i] >= a[i + 1]) {
                return 0;
            }
        }
        return 1;
    }

    public int checkgiam() {
        for (int i = 0; i < n - 1; i++) {
            if (a[i] <= a[i + 1]) {
                return 0;
            }
        }
        return 1;
    }

    public void xapxeptang(double[] a) {
        double temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public void xapxepgiam(double[] a) {
        double temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public void maxmintb() {
        double max = 0, min = 1e9, tb = 0;
        for (int i = 0; i < n; i++) {
            tb += a[i];
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("so lon nhat la : " + max);
        System.out.println("so nho nhat la : " + min);
        System.out.println("trung binh la : " + tb);
    }
}

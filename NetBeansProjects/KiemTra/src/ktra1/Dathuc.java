package ktra1;


import java.util.Scanner;

public class Dathuc {

    public Dathuc() {
    }

    private double[] a;

    public void nhap() {
        Scanner in = new Scanner(System.in);
        System.out.print("Bac cua da thuc: ");
        int n = Integer.parseInt(in.nextLine());
        a = new double[n+1];
        for (int i = n; i >= 0; i--) {
            System.out.print("Nhap gia tri bac thu " + i + ": ");
            a[i] = in.nextDouble();
        }
    }
    public void tinhX0(){
        double res=0;
        for(int i=a.length-1; i>=0; i--){
            res+=a[i] * Math.pow(2, i);
        }
        System.out.println("Gia tri da thuc tai 2: "+res);      
    }
}

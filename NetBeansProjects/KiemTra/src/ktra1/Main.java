package ktra1;


import ktra1.Dathuc;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SoNguyen a = null;
        Xau b = null;
        Dathuc c = null;
        while (true) {
            System.out.println("-------------MENU-------------");
            System.out.println("1. Nhap so nguyen duong n");
            System.out.println("2. Viet ra cac uoc so nguyen to cua n");
            System.out.println("3. Viet ra day so Fibonacci nho hon n");
            System.out.println("4. Nhap vao mot xau");
            System.out.println("5. Dua ra so cau");
            System.out.println("6. Chuan hoa ho ten");
            System.out.println("7. Nhap vao da thuc");
            System.out.println("8. tinh gia tri da thuc tai x=2");
            System.out.println("9. Tim Pn(x)  / Qm(x) va da thuc du");
            System.out.println("------------------------------");
            System.out.print("Lua chon (0->9): ");
            int chon;
            Scanner in = new Scanner(System.in);
            chon = Integer.parseInt(in.nextLine());
            switch (chon) {
                case 0:
                    System.out.println("bye bye, good luck!!!");
                    System.exit(0);
                case 1:
                    a = new SoNguyen();
                    break;
                case 2:
                    a.uocSoN();
                    break;
                case 3:
                    a.Fibo();
                    break;
                case 4:
                    b = new Xau();
                    break;
                case 5: b.demCau();
                    break;
                case 6:b.chuanHoaXau();
                    break;
                case 7:
                    c = new Dathuc();
                    c.nhap();
                    break;
                case 8:c.tinhX0();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Hay chon tu 1 den 9!!");
            }
        }
    }
}

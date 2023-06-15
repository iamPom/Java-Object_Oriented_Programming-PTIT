package bai8_ktra1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        bai8 b8=null;
        while(true){
            System.out.println("----------MENU----------");
            System.out.println("1.nhap mang so thuc");
            System.out.println("2.liet ke phan tu xuat hien 1 lan");
            System.out.println("0.thoat");
            System.out.println("nhap lua chon: ");
            Scanner sc=new Scanner(System.in);
            int chon=Integer.parseInt(sc.nextLine());
            switch(chon){
                case 0:
                    System.out.println("---Bye---");
                    System.exit(0);
                case 1:b8=new bai8();
                    break;
                case 2:
                    b8.demsolan();
                    break;
                default:
                System.out.println("chi chon 1-2");
            }

        }
    }
}

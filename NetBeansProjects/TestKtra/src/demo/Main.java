package demo;


import java.util.Scanner;

// code:
// name:
/**
 *
 * @author Pom
 */
public class Main {

    public static void main(String[] args) {
        bai1 a = null;
        bai2 b =null;
        while (true) {
            System.out.println("-------------MENU-------------");
            System.out.println("1.Nhap so nguyen n");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.");
            System.out.println("8.");
            System.out.println("9.");
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
                    a = new bai1();
                    break;
                case 2:
                    a.tong();
                    break;
                case 3:
                    a.tich();
                    System.out.println(a);
                    break;
                case 4:
                    b=new bai2();
                    break;
                case 5:
                    b.thuasonto();
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    break;
                case 8:
                    System.out.println("8");
                    break;
                case 9:
                    System.out.println("9");
                    break;
                default:
                    System.out.println("Chon tu 1->9 thoi bro =)))");
            }
        }
    }
}

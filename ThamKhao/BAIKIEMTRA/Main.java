package BAIKIEMTRA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        QLGD m = new QLGD();
        while (true) {
            System.out.println("================= MENU =================");
            System.out.println("1. Nhap giao dich vang.");
            System.out.println("2. Nhap giao dịch tiền tệ..");
            System.out.println("3. Viết ra danh sách.");
            System.out.println("4. Sửa");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Đưa ra tiền gd vàng cao nhất");
            System.out.println("================= ^^_^^ =================");

            choose = Integer.parseInt(sc.next());
            switch (choose) {
                case 1:
                    m.nhapGDVang();
                    break;
                case 2:
                    m.nhapGDTienTe();
                    break;
                case 3:
                    m.vietDS();
                    break;
                case 4:
                    m.sua();
                    m.vietDS();
                    break;
                case 5:
                    m.sapXepGDVang();
                    break;
                case 6:
//                    m.xoa();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}

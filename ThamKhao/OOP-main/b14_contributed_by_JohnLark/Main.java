package b14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        xau str=new xau();
        boolean i=true;
        while (i==true) {
            System.out.println("========MENU=========");
            System.out.println("1.Nhập vào 1 đoạn");
            System.out.println("2. Chuẩn hóa thường");
            System.out.println("3. Chuẩn hóa kiểu Anh");
            System.out.println("4. Chuẩn hóa email");
            System.out.println("\nPress other buttuon to exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nchoice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> str.nhapXau();
                case 2 -> System.out.println(str.chuanHoa());
                case 3 -> str.chuanHoaKieuAnh();
                case 4 -> str.chuanHoaEmail();
                default -> i=false;

            }
        }
    }
}

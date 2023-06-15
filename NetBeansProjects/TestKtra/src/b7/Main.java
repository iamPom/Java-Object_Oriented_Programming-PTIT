// code:
// name:
   
package b7;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        xau str=new xau();

        while (true) {
            System.out.println("========MENU=========");
            System.out.println("1.Nhập vào 1 đoạn");
            System.out.println("2. Đưa ra độ dài xâu");
            System.out.println("3. Đưa ra số từ");
            System.out.println("4. Đưa ra số câu");
            System.out.println("5. Tách các từ trong đoạn (có cả số và dấu cách)");
            System.out.println("6. Tách số trong đoạn (có cả chữ và dấu cách)");
            System.out.println("7. Tách các ký tự đặc biệt trong 1 đoạn (có cả chữ, số và dấu cách)");
            System.out.println("8. Tính tổng các số trong 1 đoạn (có cả chữ và dấu cách)");
            System.out.println("9. Đưa ra các từ trong 1 đoạn và số lần xuất hiện của nó");
            System.out.println("10. Nhập thêm 1 đoạn, đưa ra các từ xuất hiện trên cả 2 đoạn");

            Scanner scanner = new Scanner(System.in);
            System.out.println("\nchoice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> str.nhapXau();
                case 2 -> System.out.println(str.getLength());
                case 3 -> System.out.println(str.demTu());
                case 4 -> System.out.println(str.demCau());
                case 5 -> str.tachTu();
                case 6 -> str.tachSo();
                case 7 -> str.tachKyTuDacBiet();
                case 8 -> System.out.println("Tong cac so trong chuoi: "+str.sumOfDigit());
                case 9 -> str.countWords();
                case 10 -> str.typeMoreWord();

            }

        }


    }
}
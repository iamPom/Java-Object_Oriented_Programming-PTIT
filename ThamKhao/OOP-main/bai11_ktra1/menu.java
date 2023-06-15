package bai11;
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        MaTran A = new MaTran();
        MaTran B = new MaTran();
        MaTran cv = new MaTran();
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. Nhap ma tran");
            System.out.println("2. Tinh tong tung hang");
            System.out.println("3. Tim hang co tong lon nhat");          
            System.out.println("4. B co phai la ma tran con cua A khong?");
            System.out.println("5. Ma tran chuyen vi cua A");  
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->5):");
            int chon;
            Scanner scanner=new Scanner(System.in);
            chon=Integer.parseInt(scanner.nextLine());
            switch(chon){
                case 0:System.out.println("BYE!!!");
                       System.exit(0);//safe exit
                case 1:System.out.println("Nhap ma tran A");
                       A.nhapMT();
                       break;
                case 2:System.out.println("Tong cac hang");
                       A.tongHang();
                       break;
                case 3:A.hangLonNhat();
                       break;
                case 4:System.out.println("Nhap ma tran B");
                       B.nhapMT();
                       A.matranCon(B);
                       break;
                case 5:cv = A.mtchuyenVi();
                       cv.xuatMT();
                       break;  
                default:System.out.println("chi chon 0->6");
                      break; 
            }
        }
        
    }  
}


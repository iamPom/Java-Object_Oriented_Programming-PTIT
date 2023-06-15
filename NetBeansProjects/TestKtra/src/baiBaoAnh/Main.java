package baiBaoAnh;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        XuLiSoNguyen n=null;
        XuLiXau s=null;
        DaThuc a=new DaThuc();
        while(true){
            System.out.println("-------MENU-------");
            System.out.println("1. Nhap vao so nguyen duong n.");
            System.out.println("2. Viet ra cac so chan chia het cho 3");
            System.out.println("3. Viet ra cac hoan vi cua n");
            
            System.out.println("4. Nhap vao 1 xau");
            System.out.println("5. Dua ra so tu");
            System.out.println("6. Chuan hoa ho ten");
            
            System.out.println("7. Nhap vao 1 da thuc");
            System.out.println("8. Tinh gia tri da thuc tai x=1");
            System.out.println("9. Viet dao ham bac 1 cua da thuc.");
            
            System.out.println("0. Thoat ");
            System.out.println("------------------");
            System.out.print("Moi chon (0->9): ");
            int chon;
            Scanner in= new Scanner( System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 0: System.out.println("Bye!!!");
                        System.exit(0);
                   
                case 1: 
                    n=new XuLiSoNguyen();
                    break;
                case 2: 
                    n.SoChan3();
                    break;
                case 3: 
                    n.HoanVi();
                    break;
                case 4: 
                    s=new XuLiXau();
                    break;
                case 5: 
                    s.SoTu();
                    break;
                case 6: 
                    s.ChuanHoaTen();
                    break;
                case 7: 
                    a.nhap();
                    System.out.print("Da thuc: ");
                    a.viet();
                    break;
                case 8: 
                    System.out.print("Da thuc: ");
                    a.viet();
                    a.tinh();
                     break;
                case 9:
                    System.out.print("Da thuc: ");
                    a.viet();
                    DaThuc k=a.DaoHam();
                    k.viet();
                    break;
                default:
                    System.out.println("Chi chon (0->9)");
            }
        }
    }
}

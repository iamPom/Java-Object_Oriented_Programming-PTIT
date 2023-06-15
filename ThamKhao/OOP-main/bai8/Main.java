import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bai8 b8=null;
        while(true){
            System.out.println("----------MENU----------");
            System.out.println("1.nhap mang so thuc");
            System.out.println("2.liet ke phan tu xuat hien 1 lan");
            System.out.println("3.liet ke so lan xuat hien cua cac phan tu");
            System.out.println("4.kiem tra day so tang");
            System.out.println("5.kiem tra day so giam");
            System.out.println("6.sap xep day so tang");
            System.out.println("7.sap xep day so giam");
            System.out.println("8.tim so lon nhat,nho nhat,trung binh");
            System.out.println("0.thoat");
            System.out.println("nhap lua chon: ");
            int chon=Integer.parseInt(sc.nextLine());
            switch(chon){
                case 0:
                    System.out.println("---Bye---");
                    System.exit(0);
                case 1:b8=new bai8();
                    break;
                case 2:
                    b8.lietke();
                    break;
                case 3:
                    b8.demsolan();
                    break;
                case 4:
                    b8.checktang();
                    if(b8.checktang()==1){
                        System.out.println("day la day so tang");
                    }else{
                        System.out.println("khong la day so tang");
                    }
                    
                    break;
                case 5:
                b8.checkgiam();
                if(b8.checkgiam()==1){
                    System.out.println("day la day so giam");
                }else{
                    System.out.println("khong la day so giam");
                }
                    break;
                case 6:
                    b8.xapxeptang();
                    break;
                case 7:
                    b8.xapxepgiam();
                    break;
                case 8:
                    b8.maxmintb();
                    break;
                
                default:
                System.out.println("chi chon 1-2");
            }

        }
    }
}

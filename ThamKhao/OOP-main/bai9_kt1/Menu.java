package bai9;
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        TaoLap P = new TaoLap();
        TaoLap Q = new TaoLap();
        TaoLap T = new TaoLap();
        TaoLap H = new TaoLap();
        
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. Nhap da thuc");
            System.out.println("2. Tinh Pn(x0) va Qm(x0)");
            System.out.println("3. Tim dao ham bac 1");          
            System.out.println("4. Tim Pn(x)+Qm(x)");
            System.out.println("5. Tim Pn(x)-Qm(x)");
            System.out.println("6. Tim Pn(x)/Qm(x) va da thuc du");     
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->6):");
            int chon;
            Scanner scanner=new Scanner(System.in);
            chon=Integer.parseInt(scanner.nextLine());
            switch(chon){
                case 0:System.out.println("BYE!!!");
                       System.exit(0);//safe exit
                case 1:System.out.println("Tao lap da thuc P");
                       //System.out.println("Bac cua da thuc");
                       P.Input();
                       System.out.println("Tao lap da thuc Q");
                       Q.Input();
                       //P.Output();
                       //Q.Output();
                       break;
                case 2:System.out.print("Nhap x0: ");
                       float x0 = scanner.nextFloat();
                       System.out.print("P(x0)= ");
                       P.tinhX0(x0);
                       System.out.print("Q(x0)= ");
                       Q.tinhX0(x0);
                       break;
                case 3:System.out.print("Dao ham cua P(x): ");
                       P.daoHam();
                       System.out.print("Dao ham cua Q(x): ");
                       Q.daoHam();
                       break;
                case 4:
                       T = P.add(Q);
                       T.Output();
                       break;
                case 5:H = P.sub(Q);
                       H.Output();
                      break;
 //               case 6:x.tachso();
//                       break;      
                default:System.out.println("chi chon 0->6");
                      break; 
            }
        }
        
    }
    
}


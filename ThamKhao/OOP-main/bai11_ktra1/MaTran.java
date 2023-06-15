package bai11;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class MaTran {
    private int hang;
    private int cot;
    private int[][] a;
    
    Scanner scanner = new Scanner(System.in);

    public MaTran() {
        hang=0;
        cot=0;
        a = new int[hang][cot];
    }

    public MaTran(int hang, int cot) {
        this.hang = hang;
        this.cot = cot;
        a = new int[hang][cot];
    }

    public int getHang() {
        return hang;
    }

    public void setHang(int hang) {
        this.hang = hang;
    }

    public int getCot() {
        return cot;
    }

    public void setCot(int cot) {
        this.cot = cot;
    }
    
    public void nhapMT(){
        System.out.println("Nhap so hang: ");
        hang = scanner.nextInt();
        System.out.println("Nhap so cot: ");
        cot = scanner.nextInt();
        a=new int[hang][cot];
        System.out.println("Nhap gia tri ma tran: ");
        for(int i=0; i<hang; i++){
            for(int j=0; j<cot; j++){
                System.out.printf("A[%d][%d]: ", i+1, j+1);
                a[i][j]= scanner.nextInt();
            }
        }
    }
    
    public void xuatMT(){
        System.out.println("Nhap gia tri ma tran: ");
        for(int i=0; i<hang; i++){
            for(int j=0; j<cot; j++){
                System.out.printf(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public void tongHang(){
        for(int i=0; i<hang; i++){
            int tong=0;
            for(int j=0; j<cot; j++){
                tong+=a[i][j];
            }
            System.out.printf("Tong hang %d: ", i+1);
            System.out.println(tong);
        }
    }
    
    public void hangLonNhat(){
        int max=0;
        int chiSo=0;
        for(int i=0; i<hang; i++){
            int tong=0;
            for(int j=0; j<cot; j++){
                tong+=a[i][j];
            }
            if(tong>max){
                max=tong;
                chiSo=i;
            }
        }
        System.out.printf("Hang %d co tong lon nhat: ", chiSo+1);
        for(int j=0; j<cot; j++){
            System.out.print(a[chiSo][j]+" ");
        }
        System.out.println();
    }
    
    public void matranCon(MaTran b){
        int iARow, iACol;
        int iBRow, iBCol;
        boolean flg;
        int cnt = 0;
        //int[][] x=new int [b.hang][b.cot];
        for (iARow = 0; iARow <= hang - b.hang; iARow++){
             for (iACol = 0; iACol <= cot - b.cot; iACol++){
                flg = true;
                for (iBRow = 0; iBRow < b.hang; iBRow++){
                    for (iBCol = 0; iBCol < b.cot; iBCol++){
                        if (b.a[iBRow][iBCol] != a[iARow + iBRow][iACol + iBCol]){
                            flg = false;
                            break;
                        }
                    }
                    if (flg == false){
                        break;
                    }
                }
                if (flg == true){
                    cnt++;
                }
            }
            
        }
        if(cnt>0){
            System.out.println("B la ma tran con cua A");
        }
        else{
            System.out.println("B khong la ma tran con cua A");
        }
    }
    
    public MaTran mtchuyenVi(){
        MaTran cv = new MaTran(cot, hang);
        for(int i=0; i<hang; i++){
            for(int j=0; j<cot; j++){
                cv.a[j][i]=a[i][j];
            }
        }
        return cv;
    }
}

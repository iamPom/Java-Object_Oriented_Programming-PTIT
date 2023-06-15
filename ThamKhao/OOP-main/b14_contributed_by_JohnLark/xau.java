package b14;

import java.util.Scanner;

public class xau {
    private String str;

    public xau() {
    }

    public xau(String str) {
        this.str = str;
    }

    public void nhapXau() {
        System.out.print("nhap xau: ");
        Scanner scanner = new Scanner(System.in);
        this.str = scanner.nextLine();
    }

    public String chuanHoa(){
        this.str=this.str.trim();
        str=str.replaceAll("\\s+"," ");
        str=str.toLowerCase();
        String temp[] = str.split(" ");
        str = "";
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1)
                str += " ";
        }
        return str;
    }

    public void chuanHoaKieuAnh(){
        this.str=this.chuanHoa();
        String temp[] = str.split(" ");
        System.out.println("Chuẩn hóa kiểu Anh: ");
        for (int i = 1; i < temp.length; i++) {
            System.out.print(temp[i]);
            if(i!=temp.length-1) System.out.print(" ");

        }
        System.out.println(", "+temp[0]);
    }

    public void chuanHoaEmail(){
        this.str=this.chuanHoa();
        this.str=this.str.toLowerCase();
        String[] temp=str.split(" ");
        System.out.println("Chuẩn hóa email: ");
        System.out.print(temp[temp.length-1]);
        for (int i = 0; i < temp.length - 1; i++) {
            System.out.print(temp[i].charAt(0));
        }
        System.out.println("@ptit.edu.vn");
    }


}

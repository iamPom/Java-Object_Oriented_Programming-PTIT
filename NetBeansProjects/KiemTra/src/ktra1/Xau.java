package ktra1;


import java.util.Scanner;

public class Xau {

    private String s;

    public Xau() {
        System.out.print("Nhap vao mot xau: ");
        Scanner in = new Scanner(System.in);
        s = in.nextLine().trim();
        System.out.println("");
    }

    public void demCau() {
        String[] res = s.split("[\\?\\!\\.]");
        System.out.println("so cau la: "+res.length);
    }
    public void chuanHoaXau() {
        String str=s;
        str.toLowerCase();
        str.replaceAll("\\s+", " ");
        String temp[] = str.split(" ");
        str = "";
        for (int i = 1; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) {
                str += " ";
            }
        }
        str += ", ";
        str += temp[0].toUpperCase();
        System.out.println(str);
    }
}

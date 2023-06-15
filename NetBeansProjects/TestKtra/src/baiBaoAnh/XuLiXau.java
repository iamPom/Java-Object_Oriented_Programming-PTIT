package baiBaoAnh;

import java.util.Arrays;
import java.util.Scanner;

public class XuLiXau {

    private String xau;

    public XuLiXau() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap xau: ");
        xau = in.nextLine().trim();
        System.out.println("");
    }

    public void SoTu() {
        xau = xau.replaceAll("\\s+", " ");
        xau = xau.replaceAll("\\s*\\.\\s*", " ");
        xau = xau.replaceAll("\\s*\\,\\s*", " ");
        xau = xau.replaceAll("\\s*\\!\\s*", " ");
        xau = xau.replaceAll("\\s*\\?\\s*", " ");
        String[] tu = xau.split("\\s");
        System.out.println("tu: " + Arrays.toString(tu));
        System.out.println("So tu cua xau la: " + tu.length);
    }

    public void ChuanHoaTen() {
        xau = xau.trim().toLowerCase().replaceAll("\\s+", " ");
        String[] tu = xau.split(" ");
        String res = "";
        for (int i = 0; i < tu.length; i++) {
            res = res + String.valueOf(tu[i].charAt(0)).toUpperCase() + tu[i].substring(1) + " ";
        }
        System.out.println("Chuan hoa ho ten: " + res);
    }
}

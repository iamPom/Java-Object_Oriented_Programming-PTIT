// code:
// name:
package stringcodeptit;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B6_ChuanHoaHoTen_2 {

    static void chuanHoaXau(String str) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            String s;
            s = scanner.nextLine();
            s = s.trim().toLowerCase();
            s = s.replaceAll("\\s+", " ");
            chuanHoaXau(s);
        }
    }
}

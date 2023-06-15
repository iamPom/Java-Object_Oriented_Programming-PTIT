// code:
// name:
package PhanSo;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class MainXuLi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        XuLiPhanso phanso= new XuLiPhanso();
        phanso.setTu(sc.nextLong());
        phanso.setMau(sc.nextLong());
        phanso.rutGon(phanso.getTu(), phanso.getMau());
    }
}

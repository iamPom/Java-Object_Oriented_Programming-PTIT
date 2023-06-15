// code:
// name:
package TongPhanSo;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumFraction fraction1 =new  SumFraction();
        SumFraction fraction2 =new  SumFraction();
        fraction1.setTu(sc.nextLong());
        fraction1.setMau(sc.nextLong());
        fraction2.setTu(sc.nextLong());
        fraction2.setMau(sc.nextLong());
        fraction1.sumFraction(fraction1.getTu(), fraction1.getMau(), fraction2.getTu(), fraction2.getMau());
        
    }
}

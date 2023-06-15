// code:
// name:
package KhaiBaoLopNhanVien;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StaffClass staff = new StaffClass();
        staff.setName(sc.nextLine());
        staff.setSex(sc.nextLine());
        staff.setDaybirth(sc.nextLine());
        staff.setAddress(sc.nextLine());
        staff.setTaxcode(sc.nextLine());
        staff.setDaycontract(sc.nextLine());
        System.out.println(staff);
    }
}

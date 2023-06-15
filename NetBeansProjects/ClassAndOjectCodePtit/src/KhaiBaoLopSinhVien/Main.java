// code:
// name:
package KhaiBaoLopSinhVien;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            StudentClass student = new StudentClass();
            student.setName(sc.nextLine());
            student.setClassname(sc.nextLine());
            student.setDaybirth(sc.nextLine());
            student.setGpa(sc.nextFloat());
            student.convertbirth();
            System.out.println(student);
        }

    }
}

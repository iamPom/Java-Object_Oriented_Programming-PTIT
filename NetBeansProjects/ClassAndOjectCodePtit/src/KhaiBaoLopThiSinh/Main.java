// code:
// name:
package KhaiBaoLopThiSinh;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CandidateClass candidate = new CandidateClass();
        candidate.setName(sc.nextLine());
        candidate.setDatebirth(sc.nextLine());
        candidate.setScore1(sc.nextFloat());
        candidate.setScore2(sc.nextFloat());
        candidate.setScore3(sc.nextFloat());
        System.out.println(candidate.getName()+" "+candidate.getDatebirth()+" "+candidate.totalScore());
    }
}

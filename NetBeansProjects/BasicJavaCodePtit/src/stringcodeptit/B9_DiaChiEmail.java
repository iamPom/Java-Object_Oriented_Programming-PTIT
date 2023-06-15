// code:    	J03010
// name:
package stringcodeptit;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B9_DiaChiEmail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            String s;
            s = scanner.nextLine();
            s = s.trim().toLowerCase();
            s = s.replaceAll("\\s+", " ");
            String temp[] = s.split(" ");
            String res="";
            res+=temp[temp.length-1];
            for (int i = 0; i <=temp.length-2; i++) {
                res+=temp[i].charAt(0);
            }
            res+="@ptit.edu.vn";
            System.out.println(res);
        }
    }
}

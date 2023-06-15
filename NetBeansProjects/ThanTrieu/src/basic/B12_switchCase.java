// code:
// name: 
package basic;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class B12_switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Thu 2");
                break;
            case 2:
                System.out.println("Thu 3");
                break;
            case 3:
                System.out.println("Thu 4");
                break;
            case 4:
                System.out.println("Thu 5");
                break;    
            case 5:
                System.out.println("Thu 6");
                break;
            case 6:
                System.out.println("Thu 7");
                break;
            case 7:
                System.out.println("CN");
                break;
            default:
                System.out.println("Khum biec");
        }
    }
}

// code:
// name:
package KhaiBaoLopHCN;

import java.util.Scanner;

/**
 *
 * @author Pom
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RectangleClass rectangle = new RectangleClass();
        rectangle.setHeigh(sc.nextInt());
        rectangle.setWidth(sc.nextInt());
        rectangle.setColor(sc.next());
        if (rectangle.getHeigh() <= 0 || rectangle.getWidth() <= 0) {
            System.out.println("INVALID");
        } else {
            int dtich = (int) rectangle.findArea();
            int cvi = (int) rectangle.findPerimeter();
            System.out.print(cvi +" "+ dtich + " ");
            rectangle.chuanHoaSau();
        }
    }

}

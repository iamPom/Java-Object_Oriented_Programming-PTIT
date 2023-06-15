/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh_3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai1_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so: ");
        int n = Integer.parseInt(sc.nextLine());
        Bai1_CountDown t1 = new Bai1_CountDown(n);
        Bai1_ColorRun t2= new Bai1_ColorRun(n);
        t1.start();
        t2.start();
    }
}

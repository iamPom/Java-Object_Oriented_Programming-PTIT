/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh_3;

/**
 *
 * @author ASUS
 */
public class Bai3_Main {
    public static void main(String[] args) {
        Bai3_Data d = new Bai3_Data();
        Bai3_SinhngauNhien t1 = new Bai3_SinhngauNhien(d);
        Bai3_Thread2 t2 = new Bai3_Thread2(d);
        Bai3_Thread3 t3 = new Bai3_Thread3(d);
        t1.start();
        t2.start();
        t3.start();
    }
}

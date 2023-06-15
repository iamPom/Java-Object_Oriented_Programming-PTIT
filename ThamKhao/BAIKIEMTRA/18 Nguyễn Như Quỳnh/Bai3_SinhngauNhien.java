/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh_3;


import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author ASUS
 */
public class Bai3_SinhngauNhien extends Thread {

    Bai3_Data d;

    public Bai3_SinhngauNhien(Bai3_Data d) {
        this.d = d;
    }

    public void run() {
        
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        try {
            synchronized (d) {
                int ahi = 10;
                while (ahi>0) {
                    ahi--;
                    int num = ThreadLocalRandom.current().nextInt(1, 101);
                    System.out.println("\33[32m" + num);
                    d.setNum(num);
                    if (num % 5 == 0) {
                        d.setIndex(2);
                    } else {
                        d.setIndex(3);
                    }
                    d.notifyAll();
                    d.wait();
                    sleep(1000);
                }
                d.setCheck(false);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("T1 STOP!!!");
        synchronized (d) {
            d.notifyAll();
            stop();
        }
    }
}

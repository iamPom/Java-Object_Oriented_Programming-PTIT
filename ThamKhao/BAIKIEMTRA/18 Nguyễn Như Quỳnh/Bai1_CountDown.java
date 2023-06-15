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
public class Bai1_CountDown extends Thread{
    private int num;

    public Bai1_CountDown(int num) {
        this.num = num;
    }

    public void run() {
        while (num>=0) {
            System.out.println("\33[34m count: "+num--);
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    } 
}

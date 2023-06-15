/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktra3.bai11;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Thread1 extends Thread{
    private Data d;
    private int sum ;
    public Thread1(Data d) {
        this.d = d;
        sum =0;
    }
    public void run(){
        try{
            sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
       
        while(d.isRunning() ){
            synchronized(d){
                Random rand = new Random();
                int num = rand.nextInt(100)+1;
                System.out.println(num); 
                sum += num;
                if(sum >=200) {
                    System.out.println("Dung chuong trinh vi Tong cac so ngau nhien >= 200 ");
                    d.setRunning(false);
                    d.notify();
                    break;
                }
                   
                d.setNum(num);
                if(num %3 == 0)
                    d.setIndex(2);
                else
                    d.setIndex(3);
                d.notifyAll();
                try{
                    d.wait();
                    sleep(1000);
                }catch(InterruptedException e){
                    System.out.println(e);
                }                
            }
        }
        System.out.println("T1 STOP");
        synchronized(d){
            d.notifyAll();
            stop();
        }
    }
}

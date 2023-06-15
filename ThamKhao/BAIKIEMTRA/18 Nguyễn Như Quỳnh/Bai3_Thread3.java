/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh_3;

import static java.lang.Thread.sleep;

/**
 *
 * @author ASUS
 */
public class Bai3_Thread3 extends Thread{
    Bai3_Data d;

    public Bai3_Thread3(Bai3_Data d) {
        this.d = d;
    }
    public void run(){
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        //int ahi=10; 
        while(true){
            synchronized(d){
                d.notifyAll();
                while(d.getIndex()!=3 && d.isCheck()){
                    try{
                        d.wait();
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
                if(!d.isCheck())
                    break;
                int num = d.getNum();                
                if(num%2==0) System.out.println(num+" la so chan");
                else  System.out.println(num + " la so le");
                d.setIndex(1);
            }
        }
        System.out.println("T3 STOP!!!");
        synchronized(d){
            stop();
        }
    }
}

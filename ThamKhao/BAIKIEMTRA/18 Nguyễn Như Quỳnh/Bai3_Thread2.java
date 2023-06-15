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
public class Bai3_Thread2 extends Thread{
    Bai3_Data d;

    public Bai3_Thread2(Bai3_Data d) {
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
            //ahi--;
            synchronized(d){
                d.notifyAll();
                while(d.getIndex()!=2 && d.isCheck()){
                    try{
                        d.wait();
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
                if(!d.isCheck())
                    break;
                int num = d.getNum();                
                if(num%10==0) System.out.println("TRue");
                else if(num%5==0 && num%10!=0) System.out.println("false");
                d.setIndex(1);
            }
        }
        System.out.println("T3 STOP!!!");
        synchronized(d){
            stop();
        }
    }
}

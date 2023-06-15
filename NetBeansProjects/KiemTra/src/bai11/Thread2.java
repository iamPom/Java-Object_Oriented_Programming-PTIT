/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktra3.bai11;

/**
 *
 * @author Admin
 */
public class Thread2 extends Thread{
    private Data d;

    public Thread2(Data d) {
        this.d = d;
    }
    public void run(){
        while(true){
            synchronized(d){
                d.notifyAll();
                while(d.getIndex()!=2 && d.isRunning()){
                    try{
                        d.wait();
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
                if(!d.isRunning())
                    break;
                int num = d.getNum();
                System.out.println("Binh phuong cua "+ num + " :" + (num*num));
                d.setIndex(1);
            }
        }
         System.out.println("T2 STOP");
        synchronized(d){
           // d.notifyAll();
            stop();
        }
        
    }
}

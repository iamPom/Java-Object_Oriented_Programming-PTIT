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
public class Thread3 extends Thread{
    private Data d;

    public Thread3(Data d) {
        this.d = d;
    }
    public void run(){
        while(true){
            synchronized(d){
                d.notifyAll();
                while(d.getIndex()!=3 && d.isRunning()){
                    try{
                        d.wait();
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
                if(!d.isRunning())
                    break;
                int num = d.getNum();
                if(num %4 !=0)
                    System.out.println(num + " KHONG chia het cho 4");
                else
                    System.out.println(num + " CO chia het cho 4");
                d.setIndex(1);
            }
        }
         System.out.println("T3 STOP");
        synchronized(d){
           // d.notifyAll();
            stop();
        }
        
    }
}

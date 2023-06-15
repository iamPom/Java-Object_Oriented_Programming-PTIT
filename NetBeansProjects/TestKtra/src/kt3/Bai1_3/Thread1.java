
package Bai1_3;

import java.util.Random;
public class Thread1 extends Thread{
    private Data d;
    private int n;
    public Thread1(){
        
    }
    public Thread1(Data d){
        this.d = d;
        
    }
    public void run(){
        Random randomNumber = new Random();
        
        for(int i=0;i<10;i++){
                try{
                    sleep(1000);
                   
                    synchronized(d)
                    {
                        int n = randomNumber.nextInt(100)+1;
                        d.setN(n);
                        if(n % 5 ==0){
                            d.setIndex(2);
                        }
                        else{
                        d.setIndex(3);
                        }
                        d.notify();
                    }
                    }
                
                catch(InterruptedException e){
                System.out.println(e);
            }
            
            } 
            d.setRunning(false);
          
        System.out.println("T1 STOP");
        synchronized(d){
            d.notifyAll();
            stop();
        }
    }
}


package Bai1_3;


public class Thread2 extends Thread {
    private Data d;

    public Thread2(Data d) {
        this.d = d;
    }
    public void run(){
        synchronized(d){
            while(d.isRunning()){
                try{
                    d.wait();
                }catch(InterruptedException e){
                    System.out.println(e);
                }
                if(d.getIndex()!=2) {
                    d.notify();
                    continue;
                }
                int n = d.getN();
                
                if(n%10==0) System.out.println("True");
                else System.out.println("False");
                d.setIndex(1);
            }     
               
        }
        System.out.println("T2 Stop");
        synchronized(d){
            stop();
        }
    }
}

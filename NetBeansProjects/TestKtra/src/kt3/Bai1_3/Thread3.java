
package Bai1_3;


public class Thread3 extends Thread {
     private Data d;

    public Thread3(Data d) {
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
                if(d.getIndex()!=3){
                    d.notify();
                    continue;
                }
                int n = d.getN();
                System.out.print(n+": ");
                if(n%2==0) System.out.println("Chan");
                else System.out.println("Le");
                d.setIndex(1);
            }
            System.out.println("T3 stop");
            synchronized(d){
                stop();
            }
        }
    }
}

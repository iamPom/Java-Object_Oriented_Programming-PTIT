
package bai1;


public class GaMai extends Thread{
    public void run(){
        while(true){
            System.out.println("thoc thoc an an");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

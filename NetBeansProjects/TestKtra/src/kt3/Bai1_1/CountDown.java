
package kt3.Bai1_1;



public class CountDown  extends Thread{
    private int num;
    
    public CountDown(int num){
        this.num = num;
    }
    public void run(){
        while(num >= 0){
            System.out.println("\33[0mcount:" + num--);
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

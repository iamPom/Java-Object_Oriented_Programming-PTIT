
package kt3.Bai1_1;


public class ColorRun  extends Thread{
    private int num;
    
    public ColorRun(int num){
        this.num = num;
    }
    public void run(){
        int x = num;
        
        while(num >= 0){  
            int y = x - num;
            if(y % 2 == 0){
                System.out.println("\33[31mcount:" + "Red");
            }
            else{
                System.out.println("\33[34mcount:" + "Blue");
            }
            
           
            num--;
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}


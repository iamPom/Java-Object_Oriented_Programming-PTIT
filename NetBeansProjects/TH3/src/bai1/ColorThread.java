
package bai1;



public class ColorThread extends Thread{
    public void run(){
        int t=1;
        while(true){           
            if(t%2==1){
                System.out.println("\033[33mYELLOW");
                t++;
            }
            else{
                System.out.println("\033[31mRED");
                t++;
            }
            
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            
        }
    }
}
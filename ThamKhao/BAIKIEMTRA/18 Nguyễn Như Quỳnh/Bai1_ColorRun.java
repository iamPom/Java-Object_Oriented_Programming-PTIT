/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh_3;

/**
 *
 * @author ASUS
 */
public class Bai1_ColorRun extends Thread{
    private int num;

    public Bai1_ColorRun(int num) {
        this.num = num;
    }

    public void run() {
        while (num>=0) {
            if(num%2==0) System.out.println("\33[31m"+"RED");
            else System.out.println("\33[34m"+"BLUE");
            try{
                sleep(700);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            
            num--;
        }
    } 
}

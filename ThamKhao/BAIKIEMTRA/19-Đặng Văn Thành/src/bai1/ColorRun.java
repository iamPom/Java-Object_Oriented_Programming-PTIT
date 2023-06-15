/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ColorRun extends Thread {
    private int num;
    public ColorRun(){
    }

    public ColorRun(int num ) {
        this.num = num;
    }   
     public void run() {
                for(int i=1; i<=num; i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.print("ColorRun: ");
                    if(i%2==1){
                        System.out.println(String.format("\033[31m RED"));
                    }
                    else{
                        System.out.println(String.format("\033[34m BLUE"));
                    }
                }
            }
}

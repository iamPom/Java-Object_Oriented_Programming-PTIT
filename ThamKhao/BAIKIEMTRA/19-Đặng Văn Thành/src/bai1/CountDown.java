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
public class CountDown extends Thread {
    private int num;
    public CountDown(){
    }

    public CountDown(int num ) {
        this.num = num;
    }   
            public void run() {
                for(int i=num; i>=0;i--){
                    System.out.println("CountDown "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
}        
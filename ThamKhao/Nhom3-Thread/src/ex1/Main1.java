/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author ADMIN
 */
public class Main1 {
    public static void main(String[] args) {
//        Thread t=Thread.currentThread();
//        System.out.println("START "+t.getName());
//        ThreadDemo t1=new ThreadDemo("Ha noi moi");
//        t1.start();//run
//        
//        RunnableDemo r=new RunnableDemo("Pho ga");
//        Thread t2=new Thread(r);
//        t2.start();
        //bai 1
        new Thread(){
            public void run(){
                SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
                while(true){
                    System.out.println("\033[31m"+f.format(new Date()));
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        }.start();
        
        
    }
}

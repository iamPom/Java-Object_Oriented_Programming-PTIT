
package bai1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ColorThread c= new ColorThread();
        GaMai g =new GaMai();
        c.start();
        g.start();
        String in = null;
        while(sc.hasNext() && !(in=sc.next()).equalsIgnoreCase("0")){
            if(in.equalsIgnoreCase("1")){
                c.suspend();
            }else if(in.equalsIgnoreCase("2")){
                c.resume();
            }
        }
        c.stop();
        g.stop();
        sc.close();
    }
}

    

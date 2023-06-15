/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class matran {
    public static void main(String[] args){
        String filename ="src/bai2/matran.dat";
        int t=0;
        ArrayList a = new ArrayList();
        try{
            BufferedReader br= new BufferedReader (new FileReader(filename));
            String line="";
            while ((line = br.readLine())!=null){;
            String [] s=line.split("\\s+");
            for (String i:s){
                t+=Integer.parseInt(i);
            }
              a.add(t);
              t=0;
            }
            br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
        for (int i=1; i<a.size(); i++){
            System.out.println("tong hang thu: "+i+" "+a.get(i));
        }
        String fout="src/bai2/out.txt";      
        try{
            PrintWriter p= new PrintWriter(fout);
            for (int i=1; i<a.size(); i++){
                p.println(" tong hang thu" + i+ a.get(i)+" ");
            }
            p.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}

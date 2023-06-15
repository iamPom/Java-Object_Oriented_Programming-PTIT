
package bai2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String filename="src/bai2/in.txt";
        String[] tu=new String[100];
        int x=0;
       
        try{
            BufferedReader br=new BufferedReader(new FileReader(filename));
            String line=""; 
            while((line=br.readLine())!=null){
                String s=line.trim();
                boolean check=false;
                for(int i=0;i<s.length(); i++){
                    if(s.charAt(i)!=s.charAt(s.length()-i-1)|| Integer.parseInt(String.valueOf(s.charAt(i)))%2!=0){
                        check=true;
                        break;
                    }
                }
                if(check==false){
                    System.out.println("dep");
                    tu[x++]="dep";
                }
                else{
                    System.out.println("Khong dep");
                    tu[x++]="Khong dep";
                }
            }           
            br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        String fout="src/bai2/out.txt";
        try{
            PrintWriter p=new PrintWriter(fout);
            for(int i=0; i<x; i++){
                p.println(tu[i]);
            }
            p.close();
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        }

    
    }


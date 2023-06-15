/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class Bai2 {
    public static void main(String[] args) {
        FileReader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader("src/ThucHanh_3/in.txt");
            br = new BufferedReader(reader);
//            String line = br.readLine();
            System.out.println("Ma TRAN: ");
            String line=br.readLine();
            String a[] = line.split(" ");
            String str1 = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                str1 += line;
                str1 += " ";
            }
            int x= Integer.parseInt(a[0]);
            String xau[] = str1.split("\\s+");
            int cnt=0;
            String s[][] = new String[x][x];
            for(int i=0; i<x; ++i){
                for(int j=0; j<x; ++j) {
                    s[i][j] = xau[cnt++];
                }
            }
            long sum[] = new long[10];
            int k=0;
            for (int i=0; i<x; ++i){
                long tong=0;
                for(int j=0; j<x; ++j){
                    int num = Integer.parseInt(s[i][j]);
                    tong+=num;
                }
                sum[k++]=tong;
            }
            FileOutputStream fos = null;
            Scanner sc = new Scanner(System.in);
            fos = new FileOutputStream("src/ThucHanh_3/out.txt", false);
            for (int i=0; i<k; ++i) {
                String l = String.valueOf(sum[i]);
                byte[] b = l.getBytes();
                fos.write(b);
//                String li=" ";
//                byte[] b1 = l.getBytes();
//                fos.write(b1);
             }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}

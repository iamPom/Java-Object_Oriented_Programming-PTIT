package Model;

import java.io.Serializable;

public class phonghoc implements Serializable{
    private int ma;
    private String ten,soghe;
   
    private static int sma = 10000;
    public phonghoc(){
        ma = sma++;
    }

    public phonghoc(int ma, String ten, String soghe) {
        this.ma = ma;
        this.ten = ten;
        this.soghe = soghe;
    }

   

  

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoghe() {
        return soghe;
    }

    public void setSoghe(String soghe) {
        this.soghe = soghe;
    }

   

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        phonghoc.sma = sma;
    }

    

    
    public Object[] toObjects(){
        return new Object[]{
          ma,ten,soghe
        };
    }
    
}

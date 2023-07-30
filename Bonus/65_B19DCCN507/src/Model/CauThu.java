// code:
// name:
package Model;

import Controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Pom
 */
public class CauThu implements Serializable{
    private int ma,tuoi;
    private String ten,bangcap;
    private double mucluong;
    private static int Sma=100;

    public CauThu() {
    }

    public CauThu(String ten,int tuoi,  String bangcap, double mucluong) throws TrongException{
        if(ten.isEmpty()) throw new TrongException();
        this.ma = Sma++;
        this.tuoi = tuoi;
        this.ten = ten;
        this.bangcap = bangcap;
        this.mucluong = mucluong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getBangcap() {
        return bangcap;
    }

    public void setBangcap(String bangcap) {
        this.bangcap = bangcap;
    }

    public double getMucluong() {
        return mucluong;
    }

    public void setMucluong(double mucluong) {
        this.mucluong = mucluong;
    }

    public static int getSma() {
        return Sma;
    }

    public static void setSma(int Sma) {
        CauThu.Sma = Sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,tuoi,bangcap,mucluong
        };
    }
    
    
}

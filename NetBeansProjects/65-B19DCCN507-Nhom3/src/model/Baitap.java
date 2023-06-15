// code:
// name:
package model;

import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Pom
 */
public class Baitap implements Serializable {
    private int ma,tgian;
    private String ten,kieu;
    private static int sma=100;

    public Baitap() {
    }

    public Baitap(String ten, String kieu,int tgian) 
            throws TrongException {
        if(ten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.tgian = tgian;
        this.ten = ten;
        this.kieu = kieu;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getTgian() {
        return tgian;
    }

    public void setTgian(int tgian) {
        this.tgian = tgian;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Baitap.sma = sma;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,kieu,tgian
        }; 
    }
}

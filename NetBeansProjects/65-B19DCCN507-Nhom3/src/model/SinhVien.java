// code:
// name:
package model;

import controller.DienThoaiException;
import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Pom
 */
public class SinhVien implements Serializable {
    private int ma;
    private String hoten,dthoai,lop;
    private static int sma=10000;

    public SinhVien() {
    }

    public SinhVien(int ma, String hoten, String dthoai, String lop)
        throws TrongException, DienThoaiException{
        if(hoten.isEmpty() || lop.isEmpty()) throw new TrongException();
        if (!lop.matches("\\d+")) throw new DienThoaiException();
        this.ma = sma++;
        this.hoten = hoten;
        this.dthoai = dthoai;
        this.lop = lop;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDthoai() {
        return dthoai;
    }

    public void setDthoai(String dthoai) {
        this.dthoai = dthoai;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        SinhVien.sma = sma;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,hoten,dthoai,lop
        }; 
    }
    
}

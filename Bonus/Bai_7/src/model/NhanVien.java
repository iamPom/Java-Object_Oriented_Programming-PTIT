// code:
// name:
package model;

import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Pom
 */
public class NhanVien implements Serializable{
    private int ma;
    private String tennv, dchi,cmon;
    private static int  sma=10000;

    public NhanVien() {
    }

    public NhanVien(int ma, String tennv, String dchi, String cmon) {
        this.ma = ma;
        this.tennv = tennv;
        this.dchi = dchi;
        this.cmon = cmon;
    }
    public NhanVien( String tennv, String dchi, String cmon)
        throws TrongException{
        if(tennv.isEmpty()||dchi.isEmpty()||cmon.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.tennv = tennv;
        this.dchi = dchi;
        this.cmon = cmon;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    public String getCmon() {
        return cmon;
    }

    public void setCmon(String cmon) {
        this.cmon = cmon;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NhanVien.sma = sma;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,tennv,dchi,cmon
        }; 
    }
}

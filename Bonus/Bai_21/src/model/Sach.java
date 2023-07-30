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
public class Sach implements Serializable{
    private int ma;
    private String tsach,tgia,cnganh,nxban;
    private static int sma=10000;

    public Sach() {
    }

    public Sach(int ma, String tsach, String tgia, String cnganh, String nxban) {
        this.ma = ma;
        this.tsach = tsach;
        this.tgia = tgia;
        this.cnganh = cnganh;
        this.nxban = nxban;
    }
    
    public Sach( String tsach, String tgia, String cnganh, String nxban)
    throws  TrongException, DienThoaiException{
        if(tsach.isEmpty() || tgia.isEmpty()) throw new TrongException();
        if (!nxban.matches("\\d+")) throw new DienThoaiException();
        this.ma = sma++;
        this.nxban = nxban;
        this.tsach = tsach;
        this.tgia = tgia;
        this.cnganh = cnganh;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTsach() {
        return tsach;
    }

    public void setTsach(String tsach) {
        this.tsach = tsach;
    }

    public String getTgia() {
        return tgia;
    }

    public void setTgia(String tgia) {
        this.tgia = tgia;
    }

    public String getCnganh() {
        return cnganh;
    }

    public void setCnganh(String cnganh) {
        this.cnganh = cnganh;
    }

    public String getNxban() {
        return nxban;
    }

    public void setNxban(String nxban) {
        this.nxban = nxban;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Sach.sma = sma;
    }

    
    
    public Object[] toObjects(){
        return new Object[]{
            ma,tsach,tgia,cnganh,nxban
        }; 
    }
}

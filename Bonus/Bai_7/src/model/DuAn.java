// code:
// name:
package model;

import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Pom
 */
public class DuAn implements Serializable{
    private int ma;
    private String tenda, kieuda;
    private double cphi;
    private static int  sma=10000;

    public DuAn() {
    }

    public DuAn(int ma, String tenda, String kieuda, double cphi) {
        this.ma = ma;
        this.tenda = tenda;
        this.kieuda = kieuda;
        this.cphi = cphi;
    }
    
    public DuAn( String tenda, String kieuda, double cphi) throws TrongException
        {
        if(tenda.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.tenda = tenda;
        this.kieuda = kieuda;
        this.cphi = cphi;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenda() {
        return tenda;
    }

    public void setTenda(String tenda) {
        this.tenda = tenda;
    }

    public String getKieuda() {
        return kieuda;
    }

    public void setKieuda(String kieuda) {
        this.kieuda = kieuda;
    }

    public double getCphi() {
        return cphi;
    }

    public void setCphi(double cphi) {
        this.cphi = cphi;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        DuAn.sma = sma;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,tenda,kieuda,cphi
        }; 
    }
}
//public class Sach implements Serializable{
//    private int ma;
//    private String tsach,tgia,cnganh,nxban;
//    private static int sma=10000;
//
//    public Sach() {
//    }
//
//    public Sach(int ma, String tsach, String tgia, String cnganh, String nxban) {
//        this.ma = ma;
//        this.tsach = tsach;
//        this.tgia = tgia;
//        this.cnganh = cnganh;
//        this.nxban = nxban;
//    }
//    
//    public Sach( String tsach, String tgia, String cnganh, String nxban)
//    throws  TrongException, DienThoaiException{
//        if(tsach.isEmpty() || tgia.isEmpty()) throw new TrongException();
//        if (!nxban.matches("\\d+")) throw new DienThoaiException();
//        this.ma = sma++;
//        this.nxban = nxban;
//        this.tsach = tsach;
//        this.tgia = tgia;
//        this.cnganh = cnganh;
//    }
//    //get set
//    public Object[] toObjects(){
//        return new Object[]{
//            ma,tsach,tgia,cnganh,nxban
//        }; 
//    }
//}
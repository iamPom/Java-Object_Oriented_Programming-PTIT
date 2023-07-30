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
public class KeSach implements Serializable {
    private int ma;
    private String ten,lke,sltda;
    private static int sma=100;

    public KeSach() {
    }

    public KeSach(int ma, String ten, String lke, String sltda) {
        this.ma = ma;
        this.ten = ten;
        this.lke = lke;
        this.sltda = sltda;
    }
    
    
    public KeSach(String ten, String lke, String sltda)
    throws TrongException, DienThoaiException{
        if(ten.isEmpty()) throw new TrongException();
        if (!sltda.matches("\\d+")) throw new DienThoaiException();
        this.ma = sma++;
        this.sltda = sltda;
        this.ten = ten;
        this.lke = lke;
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

    public String getLke() {
        return lke;
    }

    public void setLke(String lke) {
        this.lke = lke;
    }

    public String getSltda() {
        return sltda;
    }

    public void setSltda(String sltda) {
        this.sltda = sltda;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KeSach.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,lke,sltda
        };
    }
}
//public class NhanVien implements Serializable{
//
//    private int ma;
//    private String hoten,dchi,dthoai;
//    private static int sma=1000;
//
//    public NhanVien() {
//    }
//
//    public NhanVien(int ma, String hoten, String dchi, String dthoai) {
//        this.ma = ma;
//        this.hoten = hoten;
//        this.dchi = dchi;
//        this.dthoai = dthoai;
//    }
//    
//    public NhanVien( String hoten, String dchi, String dthoai) 
//            throws TrongException, DienThoaiException {
//        if(hoten.isEmpty() || dchi.isEmpty()) throw new TrongException();
//        if (!dthoai.matches("\\d+")) throw new DienThoaiException();
//        
//        this.ma = sma++;
//        this.hoten = hoten;
//        this.dchi = dchi;
//        this.dthoai = dthoai;
//    }
//
//    public int getMa() {
//        return ma;
//    }
//
//    public void setMa(int ma) {
//        this.ma = ma;
//    }
//
//    public String getHoten() {
//        return hoten;
//    }
//
//    public void setHoten(String hoten) {
//        this.hoten = hoten;
//    }
//
//    public String getDchi() {
//        return dchi;
//    }
//
//    public void setDchi(String dchi) {
//        this.dchi = dchi;
//    }
//
//    public String getDthoai() {
//        return dthoai;
//    }
//
//    public void setDthoai(String dthoai) {
//        this.dthoai = dthoai;
//    }
//
//    public static int getSma() {
//        return sma;
//    }
//    
//   
//
//    public static void setSma(int sma) {
//        NhanVien.sma = sma;
//    }
//    public Object[] toObjects(){
//        return new Object[]{
//            ma,hoten,dchi,dthoai
//        }; 
//    }
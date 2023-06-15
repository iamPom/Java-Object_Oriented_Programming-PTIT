/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controler.TrongException;
import java.io.Serializable;

/**
 *
 * @author tiena
 */
public class Phong implements Serializable{//mã  phòng,  Tên  phòng,  Số  máy  tính,  Kiểu phòng
    private int ma;
    private String ten;
    private int somay;
    private String kieu;
    private static int sma=10000;

    public Phong() {
    }

    public Phong(String ten, int somay, String kieu) throws TrongException{
        if(ten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ten = ten;
        this.somay = somay;
        this.kieu = kieu;
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

    public int getSomay() {
        return somay;
    }

    public void setSomay(int somay) {
        this.somay = somay;
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
        Phong.sma = sma;
    }
    
    
    
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,somay,kieu
        };
    }
}

// code:
// name:
package Model;

import Controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Pom
 */
public class ViTri implements Serializable{
    private int ma,hesothuong;
    private String ten;
    private static int Sma=100;

    public ViTri() {
    }

    public ViTri(String ten,int hesothuong ) throws TrongException{
        if(ten.isEmpty()) throw new TrongException();
        this.ma = Sma++;
        this.ten = ten;
        this.hesothuong = hesothuong;
        
    }

    public ViTri(int ma,  String ten,int hesothuong) {
        this.ma = ma;
        this.hesothuong = hesothuong;
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getHesothuong() {
        return hesothuong;
    }

    public void setHesothuong(int hesothuong) {
        this.hesothuong = hesothuong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public static int getSma() {
        return Sma;
    }

    public static void setSma(int Sma) {
        ViTri.Sma = Sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,hesothuong
        };
    }
    
    
}

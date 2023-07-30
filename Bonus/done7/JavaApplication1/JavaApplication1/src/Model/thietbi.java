package Model;

import java.io.Serializable;


public class thietbi implements Serializable{
    private int ma;
    private String ten,xuatxu,namsx;
    private static int sma=10000;

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        thietbi.sma = sma;
    }

    public thietbi(int ma, String ten, String xuatxu, String namsx) {
        this.ma = ma;
        this.ten = ten;
        this.xuatxu = xuatxu;
        this.namsx = namsx;
    }



    public thietbi() {
        sma = sma++;
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

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public String getNamsx() {
        return namsx;
    }

    public void setNamsx(String namsx) {
        this.namsx = namsx;
    }

    
   
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,xuatxu,namsx
        };
    }
    
    
}

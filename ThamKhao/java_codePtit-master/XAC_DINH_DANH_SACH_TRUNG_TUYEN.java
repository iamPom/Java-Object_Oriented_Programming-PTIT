package codePtit;
import java.util.*;

class sv{
    private String ma;
    private String name;
    private float diemtoan;
    private float diemli;
    private float diemmhoa;
    private String trnagthai;
    private float diemuutien;
    private float tong;

    public sv(){}

    public void nhap(Scanner s){
        ma = s.next();
        s.nextLine();
        name = s.nextLine();
        diemtoan = s.nextFloat();
        diemli = s.nextFloat();
        diemmhoa = s.nextFloat();
    }

    public void setDiemuutien() {
        String a = ma.substring(0,3);
        if (a.equals("KV1"))
            diemuutien = 0.5f;
        else if (a.equals("KV2"))
            diemuutien = 1;
        else if (a.equals("KV3"))
            diemuutien = 2.5f;
    }

    public void setTong(){
        tong = diemtoan*2+diemli+diemmhoa;
    }

    public void setTrnagthai(float m){
        if (tong + diemuutien >= m)
            trnagthai = "TRUNG TUYEN";
        else trnagthai = "TRUOT";
    }

    public String getuutien(){
        if (diemuutien == 1){
            return "1";
        }
        else
            return Float.toString(diemuutien);
    }

    public String gettongdiem(){
        if ((tong+diemuutien) % 1 == 0)
            return String.format("%.0f", (tong+diemuutien));
        else return String.format("%.1f", (tong+diemuutien));
    }

    public float getdiemxettuyen(){
        return Float.valueOf(String.format("%.1f", (tong+diemuutien)));
    }

    public String getMa(){
        return ma;
    }

    public void xuat(){
        System.out.println(ma+" "+name+" "+getuutien()+" "+gettongdiem()+" "+trnagthai);
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<sv> res = new ArrayList<>();
        while (n-->0) {
            sv a= new sv();
            a.nhap(s);
            a.setDiemuutien();
            a.setTong();
            res.add(a);
        }
        int chirtieu = s.nextInt();
        Collections.sort(res, Comparator.comparing(sv::getMa));
        Collections.sort(res, Comparator.comparing(sv::getdiemxettuyen, Comparator.reverseOrder()));

        int c = 1;
        float m = -1;
        for (sv i : res){
            if (c == chirtieu) {
                System.out.println(String.format("%.1f", i.getdiemxettuyen()));
                m = i.getdiemxettuyen();
                break;
            }
            c++;
        }
        for (sv i : res){
            i.setTrnagthai(m);
            i.xuat();
        }
    }
}

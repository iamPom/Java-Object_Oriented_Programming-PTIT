package codePtit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private String ten;
        private String cv;
        private String hieuso;
        private String baclg;

        public sv(){}

        public void nhap(Scanner s){
            ma = s.nextLine();
            String temp[] = ma.split(" ");
            ma = temp[0];
            ten = temp[1];
            for (int i = 2;i<temp.length;i++){
                ten += " "+temp[i];
            }
        }

        public void setCv(){
            int t = Integer.valueOf(ma.substring(4));
            if (ma.substring(0,2).equals("GD")){
                if (t == 1)
                    cv = "GD";
                else cv = "NV";
            }else if (ma.substring(0,2).equals("TP")){
                if (t <= 3)
                    cv = "TP";
                else cv = "NV";
            }else if (ma.substring(0,2).equals("PP")){
                if (t <= 3)
                    cv = "PP";
                else cv = "NV";
            }else{
                cv = "NV";
            }
        }

        public String getCv(){return cv;}

        public void setBaclg(){
            baclg = ma.substring(2,4);
        }
        public void setHieuso(){
            hieuso = ma.substring(4);
        }

        public void xuat(){
            System.out.println(ten+" "+cv+" "+hieuso+" "+baclg);
        }

        public String getMa(){return ma;}

        public int getsh(){
            return Integer.valueOf(hieuso);
        }

        public String getTen(){return ten;}

        public int getbl(){
            return Integer.valueOf(baclg);
        }

    }
    public static void main(String[] args) throws FileNotFoundException {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       s.nextLine();
       int gd = 0, tp = 0, pp = 0;
       List<sv> res = new ArrayList<>();
       while(n-->0){
           sv a = new sv();
           a.nhap(s);
           a.setBaclg();
           a.setHieuso();
           a.setCv();
           res.add(a);
       }
       Collections.sort(res, Comparator.comparing(sv::getsh));
       Collections.sort(res, Comparator.comparing(sv::getbl, Comparator.reverseOrder()));
       int p = s.nextInt();
       s.nextLine();
       while (p-- > 0){
           String k = s.nextLine();
           for (sv i: res){
               if (i.getTen().toLowerCase().contains(k.toLowerCase()))
                   i.xuat();
           }
           System.out.println();
       }
    }
}
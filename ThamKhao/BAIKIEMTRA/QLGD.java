package BAIKIEMTRA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QLGD implements IChucNang {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<GiaoDich> list;

    public QLGD() {
        list = new ArrayList<GiaoDich>();
        list.add(new GDTienTe("123", "15-3-2021", 15, 14, "USD"));
        list.add(new GDTienTe("124", "15-4-2021", 117, 79, "VN"));
        list.add(new GDVang("125", "15-05-2021", 125, 34, "9999"));
        list.add(new GDVang("126", "15-3-2021", 123, 15, "9999"));
    }

    private int tontai(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(id))
                return i;
        }
        return -1;
    }

    private GiaoDich nhap() {
        String id;
        System.out.println("Nhập mã:");
        id = sc.nextLine().toUpperCase();
        while (true) {
            if (tontai(id) != -1) {
                System.out.println("Mã đã tồn tại");
                id = sc.nextLine().toUpperCase();
            } else
                break;
        }
        System.out.println("Nhập ngày (dd-mm-yyyy):");
        String ngay = sc.nextLine();
        String reg =  "^\\d{2}-\\d{2}-\\d{4}$";
        while(true){
            if(ngay.matches(reg)){
               break;
            }else{
                System.out.println("Nhập lại");
                ngay = sc.nextLine();
            }
        }
        System.out.println("đơn giá");
        double dongia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số lượng");
        int soluong = Integer.parseInt(sc.nextLine());
        return new GiaoDich(id, ngay, dongia, soluong);
    }

    @Override
    public void nhapGDVang() {
        GiaoDich p = nhap();
        System.out.println("Loại vàng");
        String loai = sc.nextLine();
        list.add(new GDVang(p.getId(), p.getNgayGiaoDich(), p.getDonGia(), p.getSoLuong(), loai));
    }

    @Override
    public void nhapGDTienTe() {
        GiaoDich p = nhap();
        System.out.println("Loại tiền");
        String loai = sc.nextLine();
        list.add(new GDTienTe(p.getId(), p.getNgayGiaoDich(), p.getDonGia(), p.getSoLuong(), loai));
    }

    @Override
    public void vietDS() {
        int gdv = 0, gdtt = 0;
        System.out.println("Giao dich vang");
        for (GiaoDich i : list) {
            if (i instanceof GDVang) {
                System.out.println(i);
                gdv++;
            }
        }
        System.out.println("Giao dich tien te");
        for (GiaoDich i : list) {
            if (i instanceof GDTienTe) {
                System.out.println(i);
                gdtt++;
            }
        }
        System.out.println("Giao dịch vàng: " + gdv);
        System.out.println("Giao dịch tiền tệ: " + gdtt);
        System.out.println("Tổng số lượng giao dịch: " + list.size());
    }

    @Override
    public void sua() {

    }

    @Override
    public void sapXepGDVang() {
        list.sort(new Comparator<GiaoDich>() {
            @Override
            public int compare(GiaoDich o1, GiaoDich o2) {
                if(o1 instanceof GDVang){
                    if(o1.getTien() >= o2.getTien()){
                        return 1;
                    }else return -1;
                }
                return 0;
            }
        });
    }

    @Override
    public void tienGiaoDichCaoNhatTheoLoaiVang() {

    }
}

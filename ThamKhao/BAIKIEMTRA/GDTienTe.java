package BAIKIEMTRA;

public class GDTienTe extends GiaoDich implements ITinhTien{
    private String loaiTien;

    public GDTienTe(String id, String ngayGiaoDich, double donGia, int soLuong, String loaiTien) {
        super(id, ngayGiaoDich, donGia, soLuong);
        this.loaiTien = loaiTien;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    @Override
    public double getTien() {
        int tigia = 0;
        if(loaiTien == "VN")tigia = 1;
        else if(loaiTien == "USD") tigia = 23;
        else tigia = 26;
        return super.getSoLuong()*super.getDonGia()*tigia;
    }

    @Override
    public String toString() {
        return super.getId() + " " + super.getNgayGiaoDich() + " " + super.getDonGia() + " " + getTien() + " " + super.getSoLuong() + " " + loaiTien;
    }
}

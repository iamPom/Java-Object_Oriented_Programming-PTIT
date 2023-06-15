package BAIKIEMTRA;

public class GDVang extends GiaoDich implements ITinhTien {
    private String loaiVang;

    public GDVang(String id, String ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
        super(id, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    @Override
    public double getTien() {
        double tigia = 0;
        if (loaiVang == "9999") tigia = 1;
        else if (loaiVang == "18k") tigia = 0.8;
        else tigia = 0.6;
        return super.getSoLuong() * super.getDonGia() * tigia;
    }

    @Override
    public String toString() {
        return super.getId() + " " + super.getNgayGiaoDich() + " " + super.getDonGia() + " " + getTien() + " " + super.getSoLuong() + " " + loaiVang;
    }
}

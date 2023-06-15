package BAIKIEMTRA;

public class GiaoDich {
    private String id;
    private String ngayGiaoDich;
    private double donGia;
    private int soLuong;
    private double tien;

    public GiaoDich(String id, String ngayGiaoDich, double donGia, int soLuong) {
        this.id = id;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

}

package com.example.qlkho.model;

public class thanhVien {
    private int tenDN;
    private String mK;
    private String hoTen;
    private String chucVu;

    public thanhVien() {
    }

    public thanhVien(int tenDN, String mK, String hoTen, String chucVu) {
        this.tenDN = tenDN;
        this.mK = mK;
        this.hoTen = hoTen;
        this.chucVu = chucVu;
    }

    public int getTenDN() {
        return tenDN;
    }

    public void setTenDN(int tenDN) {
        this.tenDN = tenDN;
    }

    public String getmK() {
        return mK;
    }

    public void setmK(String mK) {
        this.mK = mK;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
}

package com.example.qlkho.model;

import java.util.Date;

public class phieuXuatKho {
    private int maPhieu;
    private String tenSP;
    private int soLuong;
    private Date ngayXuat;

    public phieuXuatKho() {
    }

    public phieuXuatKho(int maPhieu, String tenSP, int soLuong, Date ngayXuat) {
        this.maPhieu = maPhieu;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.ngayXuat = ngayXuat;
    }

    public int getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(int maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }
}

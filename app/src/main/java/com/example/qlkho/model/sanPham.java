package com.example.qlkho.model;

import java.util.Date;

public class sanPham {
    private int maSP;
    private String tenSP;
    private int gia;
    private int soLuong;
    private int soLuuKho;
    private Date ngayLuuKho;
    private Date ngayXuatKho;

    public sanPham() {
    }

    public sanPham(int maSP, String tenSP, int gia, int soLuong, int soLuuKho, Date ngayLuuKho, Date ngayXuatKho) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.soLuuKho = soLuuKho;
        this.ngayLuuKho = ngayLuuKho;
        this.ngayXuatKho = ngayXuatKho;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSoLuuKho() {
        return soLuuKho;
    }

    public void setSoLuuKho(int soLuuKho) {
        this.soLuuKho = soLuuKho;
    }

    public Date getNgayLuuKho() {
        return ngayLuuKho;
    }

    public void setNgayLuuKho(Date ngayLuuKho) {
        this.ngayLuuKho = ngayLuuKho;
    }

    public Date getNgayXuatKho() {
        return ngayXuatKho;
    }

    public void setNgayXuatKho(Date ngayXuatKho) {
        this.ngayXuatKho = ngayXuatKho;
    }
}

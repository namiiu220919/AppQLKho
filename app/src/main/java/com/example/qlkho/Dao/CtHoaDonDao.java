package com.example.qlkho.Dao;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.qlkho.database.DbHelper;
import com.example.qlkho.model.CtHoaDon;

import java.util.ArrayList;
import java.util.List;


public class CtHoaDonDao {
    private SQLiteDatabase db;

    public CtHoaDonDao(Context context) {
        DbHelper dbHelper = new DbHelper(context);
        db = dbHelper.getReadableDatabase();
    }

    public List<CtHoaDon> getAll(int maHd) {
        String sql = "Select * from CtHoaDon where maHoaDon="+maHd;
        return getData(sql);
    }

    public boolean insertHoaDonCt(CtHoaDon hdct) {
        ContentValues values = new ContentValues();
        values.put("maSp", hdct.getMaSp());
        values.put("maHoaDon", hdct.getMaHoaDon());
        values.put("soLuong", hdct.getSoLuong());
        values.put("donGia", hdct.getDonGia());
        long row = db.insert("CtHoaDon", null, values);
        return (row > 0);
    }

    public boolean updateHoaDonCt(CtHoaDon hdct) {
        ContentValues values = new ContentValues();
        values.put("maSp", hdct.getMaSp());
        values.put("maHoaDon", hdct.getMaHoaDon());
        values.put("soLuong", hdct.getSoLuong());
        values.put("donGia", hdct.getDonGia());
        long row = db.update("CtHoaDon", values, "maCtHd=?", new String[]{String.valueOf(hdct.getMaCthd())});
        return (row > 0);
    }

    public boolean deleteHoaDonCt(int maHdCt) {
        long row = db.delete("CtHoaDon", "maCtHd=?", new String[]{String.valueOf(maHdCt)});
        return (row > 0);
    }

    private List<CtHoaDon> getData(String sql, String... selectionArgs) {
        List<CtHoaDon> list = new ArrayList<CtHoaDon>();
        Cursor c = db.rawQuery(sql, selectionArgs);
        while (c.moveToNext()) {
            CtHoaDon cthd = new CtHoaDon();
            cthd.setMaCthd(c.getInt(0));
            cthd.setMaSp(c.getInt(1));
            cthd.setMaHoaDon(c.getInt(2));
            cthd.setSoLuong(c.getInt(3));
            cthd.setDonGia(c.getInt(4));
            list.add(cthd);
        }
        return list;
    }

//    // Thực hiện truy vấn JOIN
//    String query = "SELECT HoaDon.*, CtHoaDon.* FROM HoaDon INNER JOIN CtHoaDon ON HoaDon.maHd = CtHoaDon.maHoaDon;";
//    Cursor cursor = db.rawQuery(query, null);
//
//    // Xử lý dữ liệu từ Cursor
//    if (cursor != null && cursor.moveToFirst()) {
//        do {
//            // Đọc dữ liệu từ cursor
//            int maHoaDon = cursor.getInt(cursor.getColumnIndex("maHd"));
//            String soHoaDon = cursor.getString(cursor.getColumnIndex("soHoaDon"));
//            // ... Đọc các trường khác tương ứng
//
//            int maCtHoaDon = cursor.getInt(cursor.getColumnIndex("maCthd"));
//            // ... Đọc các trường từ bảng CtHoaDon
//
//            // Xử lý dữ liệu theo nhu cầu của bạn
//        } while (cursor.moveToNext());
//    }
//
//    // Đóng cursor khi đã sử dụng xong
//    if (cursor != null) {
//        cursor.close();
//    }
}

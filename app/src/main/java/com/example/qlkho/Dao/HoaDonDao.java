package com.example.qlkho.Dao;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


import com.example.qlkho.database.DbHelper;
import com.example.qlkho.model.HoaDon;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class HoaDonDao {
    private SQLiteDatabase db;

    SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
    private Context context;

    public HoaDonDao(Context context) {
        DbHelper dbHelper = new DbHelper(context);
        db = dbHelper.getReadableDatabase();
    }

    public List<HoaDon> getAll() {
        String sql = "Select * from HoaDon";
        return getData(sql);
    }
    public HoaDon getID(String id){
        String sql = "SELECT *FROM HoaDon WHERE maHoaDon=?";
        List<HoaDon> list = getData(sql,id);
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return null;
        }
    }

    public boolean insertHoaDon(HoaDon hd) {
        ContentValues values = new ContentValues();
        values.put("maUser", hd.getMaUser());
        values.put("loaiHoaDon", hd.getLoaiHoaDon());
        values.put("ngayThang", sfd.format(hd.getNgay()));
        long row = db.insert("HoaDon", null, values);
        return (row > 0);
    }

    public boolean updateHoaDon(HoaDon hd) {
        ContentValues values = new ContentValues();
        values.put("maUser", hd.getMaUser());
        values.put("loaiHoaDon", hd.getLoaiHoaDon());
        values.put("ngayThang", sfd.format(hd.getNgay()));
        long row = db.update("HoaDon", values, "maHoaDon=?", new String[]{String.valueOf(hd.getMaHd())});
        return (row > 0);
    }

    public boolean deleteHoaDon(int maHd) {
        long row = db.delete("HoaDon", "maHoaDon=?", new String[]{String.valueOf(maHd)});
        return (row > 0);
    }

    @SuppressLint("Range")
    private List<HoaDon> getData(String sql, String... selectionArgs) {
        List<HoaDon> list = new ArrayList<>();
        Cursor cursor = db.rawQuery(sql, selectionArgs);
        while (cursor.moveToNext()) {
            HoaDon obj = new HoaDon();
            obj.setMaHd(Integer.parseInt(cursor.getString(cursor.getColumnIndex("maHoaDon"))));
            obj.setMaUser(cursor.getString(cursor.getColumnIndex("maUser")));
            obj.setLoaiHoaDon(Integer.parseInt(cursor.getString(cursor.getColumnIndex("loaiHoaDon"))));
            try {
                obj.setNgay(sfd.parse(cursor.getString(cursor.getColumnIndex("ngayThang"))));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            list.add(obj);
        }
        return list;
    }
}

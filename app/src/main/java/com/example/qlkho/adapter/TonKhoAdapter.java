package com.example.qlkho.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.example.qlkho.Dao.LoaiSpDao;
import com.example.qlkho.Dao.SanPhamDao;
import com.example.qlkho.R;
import com.example.qlkho.fragment.Frg_thongKeTonKho;
import com.example.qlkho.model.TonKho;

import java.util.ArrayList;

public class TonKhoAdapter extends ArrayAdapter<TonKho> {

    private Context context;
    private ArrayList<TonKho> list;
    Frg_thongKeTonKho frgThongKeTonKho;
    SanPhamDao sanPhamDao;
    TextView txtMasp,txtTenSp,txtGiaSp,txtLoaisp,txtSoLuong;
    ImageView imgAnhSp,imgDelete;
    byte[] hinhAnh;
    LoaiSpDao loaiSpDao;

    public TonKhoAdapter(@NonNull Context context, ArrayList<TonKho> list, Frg_thongKeTonKho frgThongKeTonKho) {
        super(context, 0,list);
        this.context = context;
        this.list = list;
        this.frgThongKeTonKho = frgThongKeTonKho;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;

        if (v==null){
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=inflater.inflate(R.layout.item_tonkho,null);
        }

        final TonKho item = list.get(position);
        if (item!=null){
            txtMasp=v.findViewById(R.id.txtmasp);
            txtTenSp=v.findViewById(R.id.txttenSp);
            txtSoLuong=v.findViewById(R.id.txtsoLuong);
            txtMasp.setVisibility(View.GONE);

            txtTenSp.setText("Tên sản phẩm: "+item.getTenSp());
            txtSoLuong.setText("Số lượng: "+item.getSoLuong());

        }


        return v;
    }

}

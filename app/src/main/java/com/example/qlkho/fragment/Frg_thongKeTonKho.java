package com.example.qlkho.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


import com.example.qlkho.Dao.ThongKeDao;
import com.example.qlkho.R;
import com.example.qlkho.adapter.TonKhoAdapter;
import com.example.qlkho.model.TonKho;

import java.util.ArrayList;

public class Frg_thongKeTonKho extends Fragment {
    ListView lstTonKho;
    ArrayList<TonKho> list;
    TonKhoAdapter adapter;
    TextView txttong;
    ThongKeDao thongKeDao;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_thong_ke_ton_kho, container, false);
        lstTonKho=v.findViewById(R.id.lstTonKho);
        txttong=v.findViewById(R.id.txttong);
        ThongKeDao thongKeDao=new ThongKeDao(getActivity());
        list = (ArrayList<TonKho>) thongKeDao.getTop();
        thongKeDao=new ThongKeDao(getActivity());
        txttong.setText("Số lượng tồn kho: "+thongKeDao.tinhTongSoLuong()+" sản phẩm");
        adapter = new TonKhoAdapter(getActivity(),list,this);
        lstTonKho.setAdapter(adapter);
        return v;
    }

}
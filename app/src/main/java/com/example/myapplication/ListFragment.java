package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class ListFragment extends Fragment {
    View v;
    private RecyclerView myrecyclerView;
    private List<com.example.myapplication.List> lstList;

    public ListFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_list,container,false);
        myrecyclerView = (RecyclerView) v.findViewById(R.id.listRV);
        RecycleViewAdapter recycleAdapter = new RecycleViewAdapter(getContext(),lstList);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(recycleAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstList = new ArrayList<>();
        lstList.add(new com.example.myapplication.List("RX-78-2 Gundam","High Grade","Rp 180.000",R.drawable.gundam));
        lstList.add(new com.example.myapplication.List("RX-178 Gundam MK-II","High Grade","Rp 240.000",R.drawable.mk2));
        lstList.add(new com.example.myapplication.List("RX-78-6 Gundam Mudrock","High Grade","Rp 270.000",R.drawable.mudrock));
        lstList.add(new com.example.myapplication.List("RX-78-GP01 Gundam Zephyrantes","High Grade","Rp 240.000",R.drawable.gp01));
        lstList.add(new com.example.myapplication.List("RX-78-GP02 Gundam Physalis","High Grade","Rp 240.000",R.drawable.gp02));
        lstList.add(new com.example.myapplication.List("MS-06 Zaku II","High Grade","Rp 220.000",R.drawable.zaku));
        lstList.add(new com.example.myapplication.List("MS-09 Dom","High Grade","Rp 180.000",R.drawable.dom));
        lstList.add(new com.example.myapplication.List("MS-07 Gouf","High Grade","Rp 210.000",R.drawable.gouf));
        lstList.add(new com.example.myapplication.List("RX-0 Unicorn Gundam","High Grade","Rp 240.000",R.drawable.unicorn));
        lstList.add(new com.example.myapplication.List("RMS-179 GMII","High Grade","Rp 180.000",R.drawable.gm2));
        lstList.add(new com.example.myapplication.List("RGM-79GS GM Command","High Grade","Rp 210.000",R.drawable.gmcommand));
        lstList.add(new com.example.myapplication.List("RGM-79N GM Custom","High Grade","Rp 220.000",R.drawable.gmcustom));
        lstList.add(new com.example.myapplication.List("RGM-79FP GM Striker","High Grade","Rp 220.000",R.drawable.gmstriker));
        lstList.add(new com.example.myapplication.List("RX-0 Unicorn Gundam 02 Banshee","High Grade","Rp 240.000",R.drawable.banshee));
    }
}

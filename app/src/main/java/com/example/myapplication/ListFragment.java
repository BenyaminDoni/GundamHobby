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
        lstList.add(new com.example.myapplication.List("RX-78-2 Gundam","High Grade","Rp 240.000",R.drawable.gundam_projek_andro_logo));
        lstList.add(new com.example.myapplication.List("RX-78-2 Gundam","High Grade","Rp 240.000",R.drawable.gundam_projek_andro_logo));
        lstList.add(new com.example.myapplication.List("RX-78-2 Gundam","High Grade","Rp 240.000",R.drawable.gundam_projek_andro_logo));
        lstList.add(new com.example.myapplication.List("RX-78-2 Gundam","High Grade","Rp 240.000",R.drawable.gundam_projek_andro_logo));
        lstList.add(new com.example.myapplication.List("RX-78-2 Gundam","High Grade","Rp 240.000",R.drawable.gundam_projek_andro_logo));
        lstList.add(new com.example.myapplication.List("RX-78-2 Gundam","High Grade","Rp 240.000",R.drawable.gundam_projek_andro_logo));
        lstList.add(new com.example.myapplication.List("RX-78-2 Gundam","High Grade","Rp 240.000",R.drawable.gundam_projek_andro_logo));
        lstList.add(new com.example.myapplication.List("RX-78-2 Gundam","High Grade","Rp 240.000",R.drawable.gundam_projek_andro_logo));
        lstList.add(new com.example.myapplication.List("RX-78-2 Gundam","High Grade","Rp 240.000",R.drawable.gundam_projek_andro_logo));
        lstList.add(new com.example.myapplication.List("RX-78-2 Gundam","High Grade","Rp 240.000",R.drawable.gundam_projek_andro_logo));
        lstList.add(new com.example.myapplication.List("RX-78-2 Gundam","High Grade","Rp 240.000",R.drawable.gundam_projek_andro_logo));
        lstList.add(new com.example.myapplication.List("RX-78-2 Gundam","High Grade","Rp 240.000",R.drawable.gundam_projek_andro_logo));
    }
}

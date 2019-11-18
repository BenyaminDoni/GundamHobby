package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

    private ArrayList<String> dataRecycle;

    public RecycleAdapter(ArrayList<String> inputData) {
        dataRecycle = inputData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView judul;
        public TextView keterangan;

        public ViewHolder(View v) {
            super(v);
            judul = (TextView) v.findViewById(R.id.judul);
            keterangan = (TextView) v.findViewById(R.id.keterangan);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String name = dataRecycle.get(position);
        holder.judul.setText(dataRecycle.get(position));
        holder.keterangan.setText("Keterangan "+(position+1));
    }

    @Override
    public int getItemCount() {
        return dataRecycle.size();
    }
}

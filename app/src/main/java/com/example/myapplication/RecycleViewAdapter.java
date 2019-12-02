package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    Context mContext;
    List<com.example.myapplication.List> nData;

    public RecycleViewAdapter(Context mContext, List<com.example.myapplication.List> nData) {
        this.mContext = mContext;
        this.nData = nData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_list,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(nData.get(position).getName());
        holder.tv_grade.setText(nData.get(position).getGrade());
        holder.tv_price.setText(nData.get(position).getPrice());
        holder.img.setImageResource(nData.get(position).getPhoto());
        holder.img.setTag(nData.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return nData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name;
        private TextView tv_grade;
        private TextView tv_price;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = (TextView) itemView.findViewById(R.id.name_list);
            tv_grade = (TextView) itemView.findViewById(R.id.grade_list);
            tv_price = (TextView) itemView.findViewById(R.id.price_list);
            img = (ImageView) itemView.findViewById(R.id.img_list);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(view.getContext(),DetailProdukActivity.class);
                    intent.putExtra("namaProduk",tv_name.getText().toString());
                    intent.putExtra("grade",tv_grade.getText().toString());
                    intent.putExtra("harga",tv_price.getText().toString());
                    intent.putExtra("idGambar",(Integer)img.getTag());
                    view.getContext().startActivity(intent);
                }
            });

        }
    }
}

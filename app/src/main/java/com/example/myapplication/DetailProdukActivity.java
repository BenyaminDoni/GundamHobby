package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailProdukActivity extends AppCompatActivity {
    private ImageView ivGambarProduk;
    private TextView txvNamaProduk;
    private TextView txvGrade;
    private TextView txvHarga;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_produk);

        ivGambarProduk=findViewById(R.id.ivGambarProduk);
        txvNamaProduk=findViewById(R.id.txvNamaProduk);
        txvGrade=findViewById(R.id.txvGrade);
        txvHarga=findViewById(R.id.txvHarga);

        Intent intent=getIntent();
        String namaProduk=intent.getExtras().getString("namaProduk");
        String grade=intent.getExtras().getString("grade");
        String harga=intent.getExtras().getString("harga");
        int imageResource=intent.getExtras().getInt("gambar");

        ivGambarProduk.setImageResource(imageResource);
        txvNamaProduk.setText(namaProduk);
        txvGrade.setText(grade);
        txvHarga.setText(harga);
    }
}

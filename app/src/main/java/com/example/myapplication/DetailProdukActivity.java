package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DetailProdukActivity extends AppCompatActivity {
    private ImageView ivGambarProduk;
    private TextView txvNamaProduk;
    private TextView txvGrade;
    private TextView txvHarga;
    private Button btnBeli;
    private Button btnBookMark;

    private int imageResourceId;
    private String namaProduk;
    private String grade;
    private String harga;

    private void beli(){
        Intent intent=new Intent(this,PembelianActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_produk);

        ivGambarProduk=findViewById(R.id.ivGambarProduk);
        txvNamaProduk=findViewById(R.id.txvNamaProduk);
        txvGrade=findViewById(R.id.txvGrade);
        txvHarga=findViewById(R.id.txvHarga);
        btnBeli=findViewById(R.id.btnBeli);
        btnBookMark=findViewById(R.id.btnBookmark);

        Intent intent=getIntent();
        namaProduk=intent.getExtras().getString("namaProduk");
        grade=intent.getExtras().getString("grade");
        harga=intent.getExtras().getString("harga");
        imageResourceId=intent.getExtras().getInt("idGambar");

        ivGambarProduk.setImageResource(imageResourceId);
        txvNamaProduk.setText(namaProduk);
        txvGrade.setText(grade);
        txvHarga.setText(harga);

        btnBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beli();
            }
        });

    }
}

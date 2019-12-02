package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Map;

public class PembelianActivity extends AppCompatActivity {

    private NumberPicker numPickerJumlah;
    private EditText txtNamaPenerima;
    private EditText txtAlamat;
    private EditText txtNoHp;
    private Button btnBeli;

    private void beliSekarang(){
        int jumlah=numPickerJumlah.getValue();
        String namaPenerima=txtNamaPenerima.getText().toString();
        String alamat=txtAlamat.getText().toString();
        String noHp=txtNoHp.getText().toString();
        if(!namaPenerima.isEmpty() && !alamat.isEmpty() && !noHp.isEmpty()){
            if(noHp.matches("[0-9]+")){
                Toast.makeText(this,"Pembelian berhasil",Toast.LENGTH_LONG).show();
                finish();
            }
            else
                Toast.makeText(this,"No HP tidak valid",Toast.LENGTH_LONG).show();
        }
        else
            Toast.makeText(this,"Semua field harus terisi",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembelian);

        numPickerJumlah=findViewById(R.id.numPickerJumlah);
        txtNamaPenerima=findViewById(R.id.txtNamaPenerima);
        txtAlamat=findViewById(R.id.txtAlamat);
        txtNoHp=findViewById(R.id.txtNoHp);
        btnBeli=findViewById(R.id.btnBeli);
        numPickerJumlah.setMinValue(1);
        numPickerJumlah.setMaxValue(100);
        btnBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beliSekarang();
            }
        });
    }
}

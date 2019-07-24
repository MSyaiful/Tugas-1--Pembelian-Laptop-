package com.msyaiful.testrumus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tugas1 extends AppCompatActivity {
    private EditText namap;
    private EditText merkl;
    private EditText jumlahl;
    private Button beli;
    private TextView infol;
    private TextView nama2;
    private TextView merk2;
    private TextView jumlah2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1);

        namap = findViewById(R.id.nama);
        merkl = findViewById(R.id.merk);
        jumlahl = findViewById(R.id.jumlah);
        beli = findViewById(R.id.beli);
        infol = findViewById(R.id.info);
        nama2 = findViewById(R.id.nama2);
        merk2 = findViewById(R.id.merk2);
        jumlah2 = findViewById(R.id.jumlah2);

        beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama2.setText("Nama Pembeli : "+namap.getText().toString());
                merk2.setText("Merk Laptop : "+merkl.getText().toString());
                jumlah2.setText("Jumlah Laptop : "+jumlahl.getText().toString());
            }
        });

    }
}
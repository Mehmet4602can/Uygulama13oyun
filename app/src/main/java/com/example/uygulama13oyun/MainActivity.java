package com.example.uygulama13oyun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Oyuncu oyuncu1;
    Oyuncu oyuncu2;
    Button tankbtn1;
    Button tankbtn2;
    Button topbtn1;
    Button topbtn2;
    Button btnrestart;
    ProgressBar progressBar1;
    ProgressBar progressBar2;
    TextView textViewsonuc;
    Integer isabet;
    ArrayList<Oyuncu> oyuncular = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oyuncu1 = new Oyuncu("Oyuncu 1",100);
        oyuncu2 = new Oyuncu("Oyuncu 2",100);
        oyuncular.add(oyuncu1);
        oyuncular.add(oyuncu2);
        tankbtn1 = findViewById(R.id.tankbtn1);
        tankbtn2 = findViewById(R.id.tankbtn2);
        topbtn1 = findViewById(R.id.topbtn1);
        topbtn2 = findViewById(R.id.topbtn2);
        btnrestart = findViewById(R.id.btnrestart);
        progressBar1 = findViewById(R.id.progressBar1);
        progressBar2 = findViewById(R.id.progressBar2);
        textViewsonuc = findViewById(R.id.textSonuc);
        topbtn1.setOnClickListener(view -> {
            isabet = oyuncu1.tankci.atesEt(oyuncu2);
            progressBar2.setProgress(oyuncu2.getCan());
            textViewsonuc.setText(isabet.toString());
            oyuncuKontrolet();
        });
        topbtn1.setOnClickListener(view -> {
            isabet = oyuncu1.topcu.atesEt(oyuncu2);
            progressBar2.setProgress(oyuncu2.getCan());
            textViewsonuc.setText(isabet.toString());
            oyuncuKontrolet();
        });
        tankbtn2.setOnClickListener(view -> {
            isabet = oyuncu2.tankci.atesEt(oyuncu1);
            progressBar1.setProgress(oyuncu1.getCan());
            textViewsonuc.setText(isabet.toString());
            oyuncuKontrolet();
        });
        topbtn2.setOnClickListener(view -> {
            isabet = oyuncu2.topcu.atesEt(oyuncu1);
            progressBar1.setProgress(oyuncu1.getCan());
            textViewsonuc.setText(isabet.toString());
            oyuncuKontrolet();
        });
        btnrestart.setOnClickListener(view -> {
            oyuncu1.setCan(100);
            oyuncu2.setCan(100);
            progressBar1.setProgress(oyuncu1.getCan());
            progressBar2.setProgress(oyuncu2.getCan());
            textViewsonuc.setText("0");
        });
    }
    private void oyuncuKontrolet() {
        for (Oyuncu oyuncu:oyuncular) {
            if (oyuncu.getCan()<=0 )
                textViewsonuc.setText("Oyun Bitti");
        }
    }

}
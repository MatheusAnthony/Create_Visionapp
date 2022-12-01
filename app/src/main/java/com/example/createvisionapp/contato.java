package com.example.createvisionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class contato extends AppCompatActivity {
    Button voltar, voltar2;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_contato);

        voltar = findViewById(R.id.btn_voltar1);
        voltar2 = findViewById(R.id.btn_voltar5);
        img = findViewById(R.id.img_ctt);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(contato.this, MainActivity.class);
                startActivity(intent);
            }
        });
        voltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mensagem();
                Intent intent = new Intent(contato.this, MainActivity.class);
                startActivity(intent);
            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/createvisiongames"));
                startActivity(intent);
            }
        });
    }
    private void Mensagem(){
        Toast.makeText(this, "Mensagem enviada!", Toast.LENGTH_LONG).show();
    }
}
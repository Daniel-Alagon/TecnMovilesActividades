package com.example.actividad2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends  AppCompatActivity{

    TextView txBienvenido;
    Button btnConfig;

    @Override
    public  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        txBienvenido=findViewById(R.id.txBienvenido);
        btnConfig=findViewById(R.id.btnConfig);

        String usuario=getIntent().getStringExtra("usuario");

        txBienvenido.setText("Bienvenido: "+ usuario);

        Toast.makeText(this,"Datos Correctos", Toast.LENGTH_LONG).show();

        if (usuario.equals("admin")) {
            btnConfig.setVisibility(Button.VISIBLE);
        }
        else {
            btnConfig.setVisibility(Button.GONE);
        }
    }
}

package com.example.actividad2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText getUsuario, getPassword;
    Button btnAceptar, btnLimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getUsuario = findViewById(R.id.getUsuario);
        getPassword = findViewById(R.id.getPassword);
        btnAceptar = findViewById(R.id.btnAceptar);
        btnLimpiar = findViewById(R.id.btnLimpiar);

        btnAceptar.setOnClickListener(view -> validarLogin());

        btnLimpiar.setOnClickListener(view -> {
            getUsuario.setText("");
            getPassword.setText("");
        });
    }

    private void validarLogin() {
        String usuario=getUsuario.getText().toString();
        String password=getPassword.getText().toString();

        if ((usuario.equals("admin") && password.equals("1234"))||(usuario.equals("usuario") && password.equals("1234"))){
            Toast.makeText(MainActivity.this,"Datos correctos", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
            intent.putExtra("usuario", usuario);
            startActivity(intent);
        }
        else {
            Toast.makeText(MainActivity.this,"Datos incorrectos", Toast.LENGTH_LONG).show();

        }
    }
}


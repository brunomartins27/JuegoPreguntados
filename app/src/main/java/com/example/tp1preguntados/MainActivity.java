package com.example.tp1preguntados;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NOMBRE = "com.example.tp1preguntados.NOMBRE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNombre = findViewById(R.id.etNombre);
        Button btnComenzar = findViewById(R.id.btnComenzar);

        btnComenzar.setOnClickListener(v -> {
            String nombre = etNombre.getText().toString().trim();
            if (!nombre.isEmpty()) {
                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                intent.putExtra(EXTRA_NOMBRE, nombre);
                startActivity(intent);
            } else {
                etNombre.setError("Ingresa tu nombre");
            }
        });

    }
}

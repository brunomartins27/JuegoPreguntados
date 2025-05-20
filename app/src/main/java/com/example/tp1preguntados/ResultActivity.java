package com.example.tp1preguntados;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        int puntaje = getIntent().getIntExtra("PUNTAJE", 0);
        int total = getIntent().getIntExtra("TOTAL", 0);
        int incorrectas = total - puntaje;

        TextView tvRes = findViewById(R.id.tvResultado);
        tvRes.setText("Correctas: " + puntaje + "\nIncorrectas: " + incorrectas);

        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> {
            Intent i = new Intent(this, MainActivity.class);

            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(i);
            finish();
        });
    }
}

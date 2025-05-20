package com.example.tp1preguntados;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class GameActivity extends AppCompatActivity {
    private String nombreJugador;
    private List<Question> preguntas;
    private int indiceActual = 0;
    private int puntaje = 0;

    private TextView tvSaludo, tvPregunta;
    private RadioGroup rgOpciones;
    private RadioButton rbOpcion0, rbOpcion1, rbOpcion2, rbOpcion3;
    private Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        nombreJugador = getIntent().getStringExtra(MainActivity.EXTRA_NOMBRE);
        tvSaludo   = findViewById(R.id.tvSaludo);
        tvPregunta = findViewById(R.id.tvPregunta);
        rgOpciones = findViewById(R.id.rgOpciones);
        rbOpcion0  = findViewById(R.id.rbOpcion0);
        rbOpcion1  = findViewById(R.id.rbOpcion1);
        rbOpcion2  = findViewById(R.id.rbOpcion2);
        rbOpcion3  = findViewById(R.id.rbOpcion3);
        btnSiguiente = findViewById(R.id.btnSiguiente);

        tvSaludo.setText("¡Hola, " + nombreJugador + "!");
        cargarPreguntas();
        mostrarPregunta();

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int seleccion = obtenerSeleccion();
                if (seleccion >= 0) {
                    verificarRespuesta(seleccion);
                    indiceActual++;
                    if (indiceActual < preguntas.size()) {
                        mostrarPregunta();
                    } else {
                        terminarJuego();
                    }
                }
            }
        });
    }
    private int obtenerSeleccion() {
        if (rbOpcion0.isChecked()) return 0;
        if (rbOpcion1.isChecked()) return 1;
        if (rbOpcion2.isChecked()) return 2;
        if (rbOpcion3.isChecked()) return 3;
        return -1;
    }

    private void cargarPreguntas() {
        preguntas = new ArrayList<>();
        preguntas.add(new Question(
                "¿Cuál es el río más largo del mundo?",
                new String[]{"Nilo", "Amazonas", "Yangtsé", "Misisipi"},
                1));
        preguntas.add(new Question(
                "¿En qué año se termino la Guerra Fria?",
                new String[]{"1991", "1969", "1972", "1962"},
                1));
        preguntas.add(new Question(
                "¿Cuantos mundiales tiene Brasil?",
                new String[]{"3", "2", "6", "5"},
                4));
        preguntas.add(new Question(
                "¿Cuál es el actual DT de Argentina?",
                new String[]{"Scaloni", "Ancelotti", "Sampaoli", "Luis Enrique"},
                1));
        preguntas.add(new Question(
                "¿Donde será el Mundial en 2026?",
                new String[]{"EE.UU", "Nigéria", "Alemania", "Paises Bajos"},
                1));
        preguntas.add(new Question(
                "¿Cuál es el actual campeón del mundial?",
                new String[]{"Brasil", "Portugal", "Argentina", "Alemania"},
                3));

    }

    private void mostrarPregunta() {
        Question q = preguntas.get(indiceActual);
        tvPregunta.setText(q.getTexto());
        rbOpcion0.setText(q.getOpciones()[0]);
        rbOpcion1.setText(q.getOpciones()[1]);
        rbOpcion2.setText(q.getOpciones()[2]);
        rbOpcion3.setText(q.getOpciones()[3]);
        rgOpciones.clearCheck();
    }

    private void verificarRespuesta(int seleccion) {
        Question q = preguntas.get(indiceActual);
        if (seleccion == q.getIndiceCorrecta()) {
            puntaje++;
        }
    }

    private void terminarJuego() {
        Intent intent = new Intent(GameActivity.this, ResultActivity.class);
        intent.putExtra("PUNTAJE", puntaje);
        intent.putExtra("TOTAL", preguntas.size());
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();  // Vuelve a MainActivity
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

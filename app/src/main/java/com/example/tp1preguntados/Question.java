package com.example.tp1preguntados;

public class Question {
    private String texto;
    private String[] opciones;
    private int indiceCorrecta;

    public Question(String texto, String[] opciones, int indiceCorrecta) {
        this.texto = texto;
        this.opciones = opciones;
        this.indiceCorrecta = indiceCorrecta;
    }
    public String getTexto() { return texto; }
    public String[] getOpciones() { return opciones; }
    public int getIndiceCorrecta() { return indiceCorrecta; }
}

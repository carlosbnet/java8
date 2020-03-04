package br.com.gerenciacursos;

public class Aula implements Comparable {


    private String titulo;
    private int tempo;


    public Aula(String titulo, int tempo){
        this.titulo = titulo;
        this.tempo = tempo;
    }


    public int getTempo() {
        return tempo;
    }

    public String getTitulo(){
        return titulo;
    }


    @Override
    public String toString() {
        return "Aula{" +
                "titulo='" + titulo + '\'' +
                ", tempo=" + tempo +
                '}';
    }


    @Override
    public int compareTo(Object outraAula) {
        Aula outraAula2 = (Aula)outraAula;
        return this.titulo.compareTo(outraAula2.titulo);
    }
}

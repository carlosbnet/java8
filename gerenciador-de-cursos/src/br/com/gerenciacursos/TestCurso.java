package br.com.gerenciacursos;

import java.util.ArrayList;
import java.util.List;

public class TestCurso {
    public static void main(String[] args) {


        Curso javaColecoes = new Curso("Dominando as coleções","Carlos Vandson");

        List<Aula> aulas = javaColecoes.getAulas();

        System.out.println(aulas);

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",20));
        javaColecoes.adiciona(new Aula("Modelando Coleções",22));
        javaColecoes.adiciona(new Aula("Java 8",50));

        System.out.println(javaColecoes.getAulas());

    }
}

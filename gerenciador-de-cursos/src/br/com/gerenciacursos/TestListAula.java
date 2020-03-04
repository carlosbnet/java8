package br.com.gerenciacursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestListAula {
    public static void main(String[] args) {
        Aula a1= new Aula("Revisando os Arrays Lists",21);
        Aula a2= new Aula("Listas de objetos",18);
        Aula a3= new Aula("Relacionamento de Listas e objetos",15);


        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);


        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTitulo));

        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);
    }
}

package br.com.gerenciacursos;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestList {
    public static void main(String[] args) {

        String aula1  = "Conhencendo mais de listas";
        String aula2  = "Modelando a classe Aula";
        String aula3  = "Trabalhando com Cursos e Sets";


        ArrayList<String> aulas = new ArrayList<>();


        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);



        for (String aula: aulas){
            System.out.println("Aula: "+aula);
        }


    }
}

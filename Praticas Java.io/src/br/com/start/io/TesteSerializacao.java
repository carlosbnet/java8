package br.com.start.io;

import java.io.*;
import java.util.Arrays;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String nome = "carlos Vandson";


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin")); //carrega o arquivo

        System.out.println(ois.readObject());

        ois.close();

//        ObjectOutputStream   oss  =  new ObjectOutputStream(new FileOutputStream("objeto.bin")); //Criar o arquivo para inserir os dados
//
//        oss.writeObject(nome); //Escreve o nome no hd em forma de binario,
//
//        oss.close();

    }
}

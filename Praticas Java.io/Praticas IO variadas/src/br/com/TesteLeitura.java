package br.com;

import java.io.*;
import java.nio.charset.Charset;

//Praticas com o pacote IO do java
//Usando de forma Raiz para ler um File


public class TesteLeitura {
    public static void main(String[] args) throws IOException {


       // FileInputStream file = new FileInputStream("texto.txt"); //Busca o arquivo e armazena na variavel file

        //FileInputStream file = new FileInputStream("infopreco.csv");

        FileInputStream file = new FileInputStream("comissao.pdf"); //Usando essa classe é um pouco dificil de entender, porem temos outras classes melhores pra fazer essa leitura..


        InputStreamReader reader = new InputStreamReader(file);


        Charset teste = Charset.defaultCharset();


        BufferedReader doc = new BufferedReader(reader);



        System.out.println(reader.getEncoding()); //Pega o encoding

        //System.out.println(reader.ready()); //Verifica se está pronto para leitura ou seja se tem alguma coisa dentro dele ou não

        //   System.out.println(reader.read()); quantidade de bytes

        String linha = doc.readLine();


        while (linha != null) {

            System.out.println(linha);
            linha = doc.readLine();

        }


        doc.close();

    }

}

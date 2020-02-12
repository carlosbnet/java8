package br.com.start.io;

import java.io.*;

public class testeLeituraEscrita {

    public static void main(String[] args) throws IOException {


      //Fluxo de entrada

        InputStream fi = System.in;//new FileInputStream("lorem.txt");
        InputStreamReader is = new InputStreamReader(fi);
        BufferedReader br = new BufferedReader(is);


     //fluxo de saida

        OutputStream fo = System.out; //FileOutputStream("lorem3.txt");
        OutputStreamWriter os = new OutputStreamWriter(fo);
        BufferedWriter bw = new BufferedWriter(os);



        String linha = br.readLine();


        while (linha != null && !linha.isEmpty()){
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        br.close();
        bw.close();

    }

}

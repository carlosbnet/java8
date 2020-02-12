package br.com.start.io;

import java.io.*;

public class testeEscrita {

    public static void main(String[] args) throws IOException {


        //Fluxo de entrada com Arquivo

        try {
            FileOutputStream fis = new FileOutputStream("lorem2.txt"); //Iniciar um arquivo com um nome especificado
            OutputStreamWriter isr = new OutputStreamWriter(fis);//tranforma o Int em caractere
            BufferedWriter bw = new BufferedWriter(isr); //ajuda a guardar
            bw.write("GG muito izi");
            bw.newLine();
            bw.newLine();
            bw.write("ou nem tanto isso");



            bw.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //InputStream faz leituras em binarios como: Imagens, pdf etc..
        //Reader -> InputStreamReader - BufferedReader - usado para leitura de caracteres, nesse caso as duas tem herança do READER
        //São templates







    }

}

package br.com.start.io;

import java.io.*;

public class testeLeitura {

    public static void main(String[] args) throws IOException {


        //Fluxo de entrada com Arquivo

        try {
            FileInputStream fis = new FileInputStream("li.pdf"); //Iniciar um arquivo com um nome especificado
            InputStreamReader isr = new InputStreamReader(fis);//tranforma o Int em caractere
            BufferedReader br = new BufferedReader(isr); //ajuda a guardar
            String linha = br.readLine();



            while (linha != null)
            {

                System.out.println(linha);
                linha = br.readLine();
            }



            br.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //InputStream faz leituras em binarios como: Imagens, pdf etc..
        //Reader -> InputStreamReader - BufferedReader - usado para leitura de caracteres, nesse caso as duas tem herança do READER
        //São templates







    }

}

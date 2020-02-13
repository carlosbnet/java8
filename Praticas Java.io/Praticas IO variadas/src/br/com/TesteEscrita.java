package br.com;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {


//        FileOutputStream fo = new FileOutputStream("teste.txt");
//
//        OutputStreamWriter os = new OutputStreamWriter(fo);       ESTE É UM DOS METODOS, NÃO TÃO BOM ASSIM
//
//        BufferedWriter bw = new BufferedWriter(os);
//----------------------------------------------------------------------------------


      //  OutputStream os = System.out;//Esse aqui so posso usar no teclado e outros, nao sendo possivel carregar um arquivo nele


//        FileWriter fw = new FileWriter("teste.txt");
//                                                                  //PODE MELHORAR MAIS, ABAIXO ESTA DE UMA FORMA MELHOR
//        BufferedWriter bw = new BufferedWriter(fw);


        BufferedWriter bw = new BufferedWriter(new FileWriter("teste.txt")); //UM POUCO MAIS ELEGANTE


        //USANDO O PRINTSTREAM


      //  PrintWriter pw = new PrintWriter("teste.txt"); //outra forma

        String ola = "Oi como vai Você????";


        bw.write(ola);
        bw.newLine();
        bw.close();


    }
}

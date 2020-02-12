package br.com.start.io;

import java.io.*;

public class testeEscrita1 {

    public static void main(String[] args) throws IOException {


        FileWriter fw = new FileWriter("log1.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Oi como vai voce?");
        bw.write(System.lineSeparator());
        bw.write(System.lineSeparator());
        bw.write("Nao como voce mais vou bem");

        FileReader fr = new FileReader("log.txt");
        BufferedReader br = new BufferedReader(fr);








        bw.close();
    }

}

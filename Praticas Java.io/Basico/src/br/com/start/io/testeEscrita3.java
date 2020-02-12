package br.com.start.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class testeEscrita3 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while(scanner.hasNextLine()){

            String linha = scanner.nextLine();
            System.out.println(linha);


            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String valor1 = linhaScanner.next();
            int valor2 = linhaScanner.nextInt();
            int valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
            double valor5 = linhaScanner.nextDouble();

            System.out.format("%s - %6d - %d- %s - %6.2f", valor1,valor2,valor3,valor4,valor5);
            System.out.println();
            System.out.println("--------------------------");
        }

        scanner.close();

    }

}

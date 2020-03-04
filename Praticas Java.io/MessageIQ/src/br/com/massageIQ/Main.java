package br.com.massageIQ;

import java.io.*;
import java.net.*;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;

public class Main {
    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {







        while (true){

           ServerSocket server = new ServerSocket(3333);

            Socket client = server.accept();

            InputStreamReader clietInput = new InputStreamReader(client.getInputStream());
            BufferedReader br = new BufferedReader(clietInput);

            System.out.println("Carlos diz: "+br.readLine());

            PrintStream clientPrint = new PrintStream(client.getOutputStream());

            Socket cliente = new Socket("192.168.0.108",3333);

            Scanner output = new Scanner(System.in);

            PrintStream dados = new PrintStream(cliente.getOutputStream());

            System.out.print("Voce: ");

            dados.println(output.nextLine());

                   cliente.close();
                  server.close();

        }

    }





}


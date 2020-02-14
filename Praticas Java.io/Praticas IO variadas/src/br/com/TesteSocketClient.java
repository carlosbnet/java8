package br.com;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TesteSocketClient {
    public static void main(String[] args) throws IOException {

        Socket cliente = new Socket("127.0.0.1",3333);

        Scanner input = new Scanner(System.in);



        PrintStream dados = new PrintStream(cliente.getOutputStream());

        System.out.println(cliente.getInetAddress().getAddress());
        System.out.println(cliente.getInetAddress());
        System.out.println(cliente.getInetAddress().getHostAddress());
        System.out.println(cliente.getInetAddress().getHostName());


      while (input.hasNextLine())
        dados.println(input.nextLine());

    }
}

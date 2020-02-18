package br.com;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class TesteSocket {
    public static void main(String[] args) throws IOException {

        ServerSocket servidor = new ServerSocket(3333);// Configura a porta 3333 para receber solicitações de outros endereços


        System.out.println("Iniciando Servidor...");



        Socket cliente = servidor.accept();

        System.out.println("Cliente "+cliente.getInetAddress().getHostAddress()+"  se conectou!");

        Scanner input = new Scanner(cliente.getInputStream());


        while (input.hasNextLine()){
            System.out.println(input.nextLine());
        }


    }
}

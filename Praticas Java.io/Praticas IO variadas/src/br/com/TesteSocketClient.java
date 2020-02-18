package br.com;

import java.io.*;
import java.net.*;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;

public class TesteSocketClient {
    public static void main(String[] args) throws IOException {


        String[] ip_fatiado = new String[0];


        ServerSocket servidor = new ServerSocket(3333);// Configura a porta 3333 para receber solicitações de outros endereços


        Enumeration<NetworkInterface> buscEnd = NetworkInterface.getNetworkInterfaces();


        while (buscEnd.hasMoreElements()) {

            List endereco = buscEnd.nextElement().getInterfaceAddresses();
            if (buscEnd.nextElement().isLoopback()) {

                String endBruto = endereco.get(1).toString();
                String[] end_limpo = endBruto.split("/");
                ip_fatiado = end_limpo[1].split("\\.");
                break;
            }

        }


        for (int x = 100; x < 120; x++) {


            Integer endLocal = Integer.parseInt(ip_fatiado[3]);

            endLocal = x
            ;

            String novoValor = new String(endLocal.toString());

            ip_fatiado[3] = novoValor;

            String ip = String.join(".",ip_fatiado);

         try {
             Socket client = new Socket(ip, 3333);
             client.setSoTimeout(10);
             if (client.isConnected()){
                 System.out.println("Um novo amigo foi encontrado!");
                 client.close();
             }
         }catch (Exception e){
             System.out.println(e.getMessage());
             System.out.println(ip);
         }






            //  Scanner input = new Scanner(System.in);


//        PrintStream dados = new PrintStream(cliente.getOutputStream());
//
//
//
//      while (input.hasNextLine())
//        dados.println(input.nextLine());

        }
    }
}
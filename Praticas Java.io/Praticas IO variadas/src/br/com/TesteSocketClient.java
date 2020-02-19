package br.com;

import java.io.*;
import java.net.*;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;

public class TesteSocketClient {
    public static void main(String[] args) throws IOException {






        ServerSocket servidor = new ServerSocket(3333);// Configura a porta 3333 para receber solicitações de outros endereços




        for (int x = 100; x < 120; x++) {

            String ipLocal =  String.join(".",ip_fatiado);

            Integer endLocal = Integer.parseInt(ip_fatiado[3]);

            endLocal = x;

            ip_fatiado[3] = new String(endLocal.toString());

            String ip = String.join(".",ip_fatiado);



         try {
            Socket client = new Socket(ip, 3333);
             client.setSoTimeout(10);


             if (client.isConnected() && !ip.equals(ipLocal)){
                 System.out.println("Um novo amigo foi encontrado: "+ ip );
                 clientList.add(ip);
                 client.close();
             }



         }catch (Exception e){
             System.out.print(e.getMessage());
             System.out.println(" - - "+ip);

         }


        }


        clientConnect = new Socket(clientList.get(0).toString(),3333);


        Scanner input = new Scanner(System.in);

        PrintStream dados = new PrintStream(clientConnect.getOutputStream());



        while (input.hasNextLine())
            dados.println(input.nextLine());


    }
}
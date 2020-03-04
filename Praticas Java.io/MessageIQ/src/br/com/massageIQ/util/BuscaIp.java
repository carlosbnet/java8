package br.com.massageIQ.util;

import javax.swing.*;
import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class BuscaIp {

    Socket clientConnect;
    ArrayList clientList = new ArrayList();
    String[] clientIp;


    TrataIp trataIp = new TrataIp();



  public   BuscaIp() throws IOException {

        this.clientIp = trataIp.getIp().split("\\.");


    }


    public void getClientList(){


        for (int x = 100; x < 120; x++) {


            Integer endLocal = Integer.parseInt(clientIp[3]);

            endLocal = x;

            clientIp[3] = new String(endLocal.toString());

            String ip = String.join(".",clientIp);


            try {

                int timeOut = 100;
                SocketAddress sktAdrress = new InetSocketAddress(ip,3333);
                Socket client = new Socket();

                client.connect(sktAdrress,timeOut);

               if (client.isConnected() && !ip.equals(trataIp.getIp())){ //
                    System.out.println("Um novo amigo foi encontrado: "+ ip );
                    clientList.add(ip);
                    client.close();

                }



            }catch (Exception e){
                System.out.print(e.getMessage());
                System.out.println(" - - "+ip);

            }


        }

    }


    public ArrayList<String> getClients(){

      return this.clientList;

    }







}

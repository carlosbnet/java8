package br.com.massageIQ.util;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.List;

public class BuscaIp {

    Socket clientConnect = null;
    List clientList = null;
    String[] clientIp = null;


    TrataIp trataIp = new TrataIp();



  public   BuscaIp() throws SocketException {

        this.clientIp = trataIp.getIp().split("\\.");

    }


    public void getClientList(){


        for (int x = 0; x < 255; x++) {


            Integer endLocal = Integer.parseInt(clientIp[3]);

            endLocal = x;

            clientIp[3] = new String(endLocal.toString());

            String ip = String.join(".",clientIp);


            try {

                int timeOut = 100;
                SocketAddress sktAdrress = new InetSocketAddress(ip,3333);
                Socket client = new Socket();

                client.connect(sktAdrress,timeOut);

               if (client.isConnected()){ // && ip.compareTo(trataIp.getIp()) != 1
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










}

package br.com.massageIQ.util;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.List;

public class TrataIp {


    String ip = null;

    //busca pelo ip da maquina atual pra que com base nele, procure outros na rede


    public String getIp() throws SocketException {

        Enumeration<NetworkInterface> buscEnd = NetworkInterface.getNetworkInterfaces(); //Interface de redes

        while (buscEnd.hasMoreElements()) {

            List endereco = buscEnd.nextElement().getInterfaceAddresses();

            if (buscEnd.nextElement().isLoopback()) {                   //Verifica se nao é o ip padrao 127 ...

                String ipBruto = endereco.get(1).toString();
                String[] ipSemiLimpo = ipBruto.split("/");       //Tira tudo nao que queremos e so deixa o ip
                ip = ipSemiLimpo[1];

            }

        }
        return ip;
    }



}

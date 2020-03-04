package br.com.massageIQ;

import br.com.massageIQ.util.TrataIp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ConfigSocketServer {


    Socket clientRecept;


    public Socket socketRecept() throws IOException {

        ServerSocket serveClient = new ServerSocket(3333);

            clientRecept = serveClient.accept();

        return clientRecept;

    }


    public Socket socketSubmit() throws IOException {

        System.out.println(clientRecept.getInetAddress());

        Socket submit = new Socket(clientRecept.getInetAddress(),3333);

        return submit;

    }

}

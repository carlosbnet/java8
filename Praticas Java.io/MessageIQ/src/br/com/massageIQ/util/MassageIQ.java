package br.com.massageIQ.util;

import br.com.massageIQ.ConfigSocketServer;

import javax.naming.ldap.SortKey;
import javax.sound.midi.Soundbank;
import java.io.*;
import java.net.Socket;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class MassageIQ {

    boolean connect;
    ConfigSocketServer submit;
    Socket clientSubmit;


    public void massageRecpet(Socket clientRecept) throws IOException {

            if (connect != true){
                submit = new ConfigSocketServer();
                clientSubmit = submit.socketSubmit();
                connect = false;
            }

        Scanner input = new Scanner(clientRecept.getInputStream());

            while (input.hasNextLine()){
                System.out.println(clientRecept.getRemoteSocketAddress()+" "+ input.nextLine());
            }


    }

    public void messagSubmit() throws IOException {

        Scanner input = new Scanner(System.in);

        PrintStream submit = new PrintStream(clientSubmit.getOutputStream());

        while (input.hasNextLine()){
            submit.println(input.nextLine());
        }


    }



}

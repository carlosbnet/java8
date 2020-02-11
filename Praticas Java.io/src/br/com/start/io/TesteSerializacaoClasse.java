package br.com.start.io;

import java.io.*;

public class TesteSerializacaoClasse {
    public static void main(String[] args) throws IOException, ClassNotFoundException {



//
//        Cliente cliente = new Cliente();
//
//        cliente.setNome("Carlos vandson");
//        cliente.setProfissao("Dev");
//        cliente.setCpf("23264125");
//
//        ObjectOutputStream oos  =  new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//
//        oos.writeObject(cliente); //Escreve o nome no hd em forma de binario,
//
//        oos.close();



        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin")); //carrega o arquivo

        Cliente cliente = (Cliente) ois.readObject();


        //String cli = new String(cliente.toString().getBytes());



        System.out.println(cliente.getNome());

        ois.close();




    }
}

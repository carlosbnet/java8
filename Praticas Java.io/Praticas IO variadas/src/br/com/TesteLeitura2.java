package br.com;

//Exemplo com input puro, pra pegar o que é digitado no teclado


import java.io.*;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws IOException {


        InputStream input = System.in; //Esse aqui so posso usar no teclado e outros, nao sendo possivel carregar um arquivo nele

        InputStreamReader isr = new InputStreamReader(input);//Esse aqui transforma bytes em caracteres, ele é crucial para funcionar o negocio.

        BufferedReader br = new BufferedReader(isr); //So guarda e organizar os dados do input pra nao fica bagunçado nem faltando uma parte


        System.out.println(br.readLine());



    }
}

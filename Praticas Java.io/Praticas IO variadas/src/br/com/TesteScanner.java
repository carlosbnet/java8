package br.com;

import com.sun.source.doctree.SinceTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) throws FileNotFoundException {


        Scanner file = new Scanner(new File("infopreco.csv")); // Pega o arquivo como um todo


        System.out.println("|  CNPJ                    |  NOME                                                          |  ENDEREÇO                                                          |   NUMERO             |    COMPLEMENTO                                                |     BAIRRO                                              |     CIDADE                              |   UF               |     PRODUTO                            |   VALOR DA VENDA  |    DATA CADASTRO        |");
        while(file.hasNextLine()){

            String linha = file.nextLine(); //Mostra todos os dados que tem dentro do arqvuico...sem nenhuma formatação
            //System.out.println(linha);

            //------------------------------------------------------------
            //Vamos detalhar os dados por coluna usando um delimitador nessa caso a ","

            if (linha != null && !linha.isEmpty()){
                Scanner lineFile = new Scanner(linha);
                lineFile.useDelimiter(",");

                String    cnpj = lineFile.next();
                String nome = lineFile.next();
                String endereco = lineFile.next();
                String numero = lineFile.next();
                String complemento = lineFile.next();
                String bairro = lineFile.next();
                String cidade = lineFile.next();
                String uf = lineFile.next();
                String produto = lineFile.next();
                double valor_venda= lineFile.nextDouble();
                String data_cadastro = lineFile.next();

                    //Trata data e hora
                    String[] data_hora = data_cadastro.split(" "); //Separa a data da hora
                    String[] hora_min = data_hora[1].split(":"); //Serapara a hora em duas Hora e Minuto
                    String[] dia_mes_ano = data_hora[0].split("/");  //Separa a data em dia/mes/ano

                    //depois poderia converter essa hora e data pra fazer certos calculos


                System.out.printf("|  %-15s         |  %-40s                      |  %-50s                |   %-15s    |    %-50s         |     %-40s            |     %-30s      |   %-15s  |     %-20s               |     %f      |     %s/%s/%s - %s:%s  |\n",cnpj,nome,endereco,numero,complemento,bairro,cidade,uf,produto,valor_venda,dia_mes_ano[0],dia_mes_ano[1],dia_mes_ano[2],hora_min[0],hora_min[1]);


            }else {

            }










        }




    }
}

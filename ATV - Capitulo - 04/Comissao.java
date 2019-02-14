import java.util.Scanner;

public class Comissao
{

	private int contador;
	private String nomeVendedor;
	private int porc = 9;
	private double valorTotal;
	private double valorComissao;

	Scanner input = new Scanner(System.in);

	public void setCalcVendaCom(double valorItem)
	{
	  System.out.println("Voce entrou no laço");

	   while (valorItem != -1)
	   {
	     valorTotal += valorItem;
	     contador++; 
	     System.out.print("Digite o Valor do Iten:");
	     valorItem = input.nextDouble();

	   }

	   if (contador != 0)
           {
             valorComissao = (valorTotal * 9)/100;
           }
           else
           {
           System.out.println("Esse mês você vai passar fome..sem Comissão");
	   }


	 System.out.println("Você Saiu do laço");
	}


	public void setVendedor(String nomeVendedor)
	{
	   this.nomeVendedor = nomeVendedor;
	}


	//Retorno de informações


	public String getNomeVendedor()
	{
	  return nomeVendedor;
	}


	public double getValorTotal() 
        { 
          return valorTotal;
        }

        public double getValorComissao() 
        { 
          return valorComissao;
        }

        public int getContador() 
        { 
          return contador;
        }





}

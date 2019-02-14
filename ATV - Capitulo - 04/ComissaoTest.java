import java.util.Scanner;

public class ComissaoTest
{

	public static void main(String[] args)
	{

	Scanner input = new Scanner(System.in);
	Comissao objeto1 = new Comissao();

	System.out.print("Digite o Seu Nome:");
        String nomeVendedor = input.nextLine();

        System.out.print("Digite o Valor do Iten:");
        double valorItem = input.nextDouble();

	objeto1.setVendedor(nomeVendedor);
	objeto1.setCalcVendaCom(valorItem);

	imprimir(objeto1);
	}


	public static void imprimir(Comissao objeto1)
	{
	System.out.printf("Nome do Vendedor:%s%n",objeto1.getNomeVendedor());
        System.out.printf("Quantidade de itens:%d%n",objeto1.getContador());
        System.out.printf("Valor Total da Venda:%.2f%n",objeto1.getValorTotal() );
        System.out.printf("Valor da Comissão:%.2f%n",objeto1.getValorComissao());
	}
}

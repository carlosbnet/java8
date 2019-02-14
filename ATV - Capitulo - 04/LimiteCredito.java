import java.util.Scanner;


public class LimiteCredito
{

	public static void main(String[] args)
	{

	int conta = 0;
	int saldoInicial = 0;
	int limiteCred = 0;
	int despesas = 0;
	int credAplic = 0;
	int novoSaldo = 0;


	Scanner input = new Scanner(System.in);

	System.out.print("Informe a conta: ");
	conta = input.nextInt();

	System.out.print("Informe qual o saldo inicial: ");
	saldoInicial = input.nextInt();

	System.out.print("Informe qual o limite de credito: ");
	limiteCred = input.nextInt();

	System.out.print("Insira o valor total das despesas: ");
	despesas = input.nextInt();

	System.out.print("Qual o valor credito aplicado no mes: ");
	credAplic = input.nextInt();

	novoSaldo = saldoInicial + despesas - credAplic;

	System.out.printf("o Novo Saldo a pagar é: %d%n", novoSaldo);

	if (novoSaldo > limiteCred)
	{
		System.out.print("Ops: Limite de Credito Excedido!\n");
	}
	else if (novoSaldo == limiteCred)
	{
		System.out.print("Ops: Você ja esta no vermelho\n");
	}
	else if (novoSaldo < 0)
	{
		System.out.print("Você tem saldo positivo para o outro mes!\n");
	}

}
}

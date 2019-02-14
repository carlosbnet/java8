import java.util.Scanner;




public class soma
{
	public static void main(String[] args)
	{
	int valor1;
	int valor2;
	int soma;
	char x;

	Scanner input = new Scanner(System.in);

	System.out.print("Digite o primeiro valor: ");
	valor1 = input.nextInt();

	System.out.print("Digite o segundo valor: ");
	valor2 = input.nextInt();

	soma = valor1 + valor2;
	x = 'A';
	System.out.printf("Valor total é: %d%nsua letra da sorte é:%s%n",soma,x);

	}

}

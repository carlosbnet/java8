import java.util.Scanner;

public class Aritmetica
{
	public static void main(String[] args)
	{

	Scanner input = new Scanner(System.in);
	int x;
	int y;
	int mult;
	int sub;
	int div;
	int soma;
	System.out.print("Digite o primeiro valor:");
	x = input.nextInt();
	System.out.print("Digite o segundo valor:");
	y = input.nextInt();
	soma = x + y;
	mult = x * y;
	sub = x - y;
	div = x / y;
	System.out.printf("A soma total é:%d%n" ,soma);
	System.out.printf("O Produto é:%d%n" ,mult);
	System.out.printf("A Diferença é:%d%n" ,sub);
	System.out.printf("A divisão é:%d%n", div);

	}

}


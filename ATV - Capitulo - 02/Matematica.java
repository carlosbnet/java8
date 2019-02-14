import  java.util.Scanner;


public class Matematica
{
	public static void main(String[] args)
	{
	int x;
	int y;
	int resto;

	Scanner input = new Scanner(System.in);

	System.out.print("Digite o Dividendo: ");
	x = input.nextInt();
	
	System.out.print("Digite o Divisor: ");
	y = input.nextInt();


	resto = 5*(x+y);

	System.out.printf("o resta da divisão é:%d%n",resto);


	}
}

import java.util.Scanner;

public class Fatorial
{

	public static void main(String[] args)
	{

	long total = 1;


	Scanner input = new Scanner(System.in);

	System.out.print("Digite o valor: ");
	long fat = input.nextLong();

	for (long x=1; x<=fat; ++x)
	{

	total *= x;
	System.out.printf("Total parcial: %d%n",total);

	}

	System.out.printf("O valor do fatorial é:%d%n",total);
}
}

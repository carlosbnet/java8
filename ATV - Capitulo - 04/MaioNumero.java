import java.util.Scanner;

public class MaioNumero
{

	public static void main(String[] args)
	{

	int counter = 1;
	int number = 0;
	int largest = 0;
	int largest2 = 0;


	Scanner input = new Scanner(System.in);


	while (counter <= 10)
	{
		System.out.print("Insira o numero: ");
		number = input.nextInt();

		  if (number > largest)
		  {
			  largest2 = largest;
			  largest = number;
		  }

		 else if (number > largest2)
		{
			largest2 = number;
		}


		++counter;
	}

	System.out.printf("O Primeiro maior valor é: %d%n", largest);
	System.out.printf("O Segundo maior valor é: %d%n", largest2);
}

}

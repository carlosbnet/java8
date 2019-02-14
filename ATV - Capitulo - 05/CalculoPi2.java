import java.util.Scanner;

public class CalculoPi2
{

	public static void main(String[] args)
	{

	double deno = 1;
	double num = 4;
	double pi = 0;
	double k = 0;

	Scanner input = new Scanner(System.in);

	System.out.print("Didige o numero de termos: ");
	k = input.nextInt();

	for (double j = 1; j <=k; j++, deno+=2)
	{

	pi += Math.pow(-1,(j+1)) * (num/deno);

	}

   System.out.printf("O valor aproximado de PI é:%f%n", pi);
}
}

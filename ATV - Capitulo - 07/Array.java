import java.util.Scanner;



public class Array
{

	public static void main(String[] args)
	{

	Scanner input = new Scanner(System.in);


	int leg = 5;
	int total = 0;
	int [] c = new int[leg];
	int [] b = new int[100];

	for (int counter = 0;counter<c.length; counter++)
	{

	System.out.printf("Digite a %dº nota:%n",counter+1);
	int nota = input.nextInt();

	c[counter] += nota;

	total += c[counter];
	}

	for (int counter=0; counter<c.length; counter++)
	{

	System.out.printf("A nota foi:%d%n", c[counter]);

}

		double media = total/5;
		System.out.printf("O valor total é:%f", media);

}

}

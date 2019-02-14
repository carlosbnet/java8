import java.util.Scanner;

public class raio
{

	public static void main(String[] args)
	{

	double pi = 3.14;
	double area = 0;
	double raio = 0;

	Scanner input = new Scanner(System.in);

	System.out.print("Digite o valor do Raio: ");
	raio = input.nextFloat();

	area = pi * (raio * raio);

	System.out.printf("O valor da area é:%f%n",area);

}
}

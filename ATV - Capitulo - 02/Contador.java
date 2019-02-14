import java.util.Scanner;

public class Contador
{
	public static void main(String[] args)
	{

	Scanner input = new Scanner(System.in);

	char c;

	System.out.print("Digite o caractere:");
	c = input.nextLine().charAt(0);

System.out.printf("O valor de %c no unicode é %d%n",c, ((int) c));


}
}

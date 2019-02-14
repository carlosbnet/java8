import java.util.Scanner;

public class imparoupar
{
	public static void main(String[] args)
	{

	Scanner input = new Scanner(System.in);
	

	System.out.print("Digite o valor:");
	int x = input.nextInt();
	System.out.print("Digite outo valor");
	int y = input.nextInt();


	int result = x % y;

	if (result == 0)
	System.out.printf("O valor %d é multiplo do segundo valor!%n", x);

	if (result == 1)
	System.out.printf("o valor %d não é multiplo do segundo valor!%n",x);


}
}

import java.util.Scanner;

public class Comparacao
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	int x;
	int y;
	
	System.out.print("Digite o primeiro valor:");
	x = input.nextInt();
	System.out.print("Digita o primeiro valor:");
	y = input.nextInt();
	
		if (x > y)
		   System.out.printf("O maior é:%s%n",x);

		if (y > x)
		   System.out.printf("O maior é:%s%n", y);

		if (x == y)
		   System.out.printf("Os valores são iguais!%n");

}
}

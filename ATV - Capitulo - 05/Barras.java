import java.util.Scanner;

public class Barras
{
	public static void main(String[] args)
	{

	Scanner input = new Scanner(System.in);
	int num = 0;



	while(num!=-1)
	{

	System.out.print("\nDigite um valor entre 1 a 30: ");
	num = input.nextInt();

	System.out.printf("%d  ",num);

	     for(int x=1; x <= num; ++x)
	     {
		System.out.print("*");
	     }
	}




}
}

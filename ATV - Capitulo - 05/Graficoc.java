

public class Graficoc
{

	public static void main(String[] args)
	{

	int j = 0;
	int k = 10;

	for(int l= 1; l<=10; ++l)
	{


	for(int x=1; x <= j; ++x)
	System.out.print(" ");


	for(int y=1; y <= k; ++y)
	System.out.print("*");

	System.out.println();
	j++;  //mudando de ++ para -- o triangulo é invertido
	k--;
}
}

}

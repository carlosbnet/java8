

public class Losango
{

	public static void main(String[] args)
	{

	int j = 0;
	int k = 9;

	for(int l= 1; l<=9; ++l)
	{


	for(int x=1; x <= j; ++x)
	System.out.print(" ");


	for(int y=1; y <= k; y+=2)
	System.out.print("*");

	for(int z=1; z <= k; z+=2)
        System.out.print("*");

	System.out.println();

	 //for(int z=1; z <= j; ++z)
         //System.out.print(" ");


	j++;  //mudando de ++ para -- o triangulo é invertido
	k--;
}
}

}

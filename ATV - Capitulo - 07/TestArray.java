import java.util.Arrays;

public class TestArray
{
	public static void main(String[] args)
	{

	int[] array1 ={8,5,3,1,6,4,7,2};
	int[] array2 = new int[5];



	System.out.print("Teste da Classe Array:");


	Arrays.sort(array1);


	for (int x : array1)
	{
	   System.out.printf(" %d%n",x);
	}


	Arrays.fill(array2, 10);



	for (int x: array2)
	{
		System.out.printf("%d%n",x);
	}

	int[] array3 = {2,4,8,1,6,3,9,10};

 	int localiza = Arrays.binarySearch(array3,10);

	System.out.println("O vaor é esse:"+localiza);

}
}

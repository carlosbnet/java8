import java.util.Arrays;


public class Comandos
{
	public static void main(String[] args){


	int[] array1 = new int[10];

	int[] array2 = new int[15];

	int[] array3 = {3,4,2,5,3};


	Arrays.fill(array1,0);

	for(int x = 0;x<array1.length;x++){

	System.out.println("\n"+array1[x]);

	}

	for(int x=0;x<array2.length;x++){

	array2[x] = 1;

	System.out.printf(" %d ",array2[x]);

	}


	System.out.println();

	for(int x = 0; x<array3.length;x++){

	System.out.printf("%d%n",array3[x]);

	}

}
}

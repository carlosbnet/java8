import java.util.Arrays;
import java.util.Scanner;


public class ArrayTest
{

	public static void main(String[] args)
	{

	int valor = 0;
	Scanner input = new Scanner(System.in);

	int[] array1 = {94,23,64,22,30,14,100,90,45,255};
	int[] array2 = new int[10];

	for (int x : array1){
		System.out.print(x);
	}

	System.out.println();

	System.arraycopy(array1,0, array2,0, array1.length);

	for (int x : array2){
	System.out.print(x);
	}

	System.out.println();
	boolean va1 = Arrays.equals(array1,array2);
	System.out.println(va1);
	Arrays.sort(array1);
	for (int x : array1)
		System.out.print(x);

	System.out.println();

	

	while(valor!=-1){

	System.out.print("Digite o valor para buscar");
	valor = input.nextInt();

	int loc = Arrays.binarySearch(array1, valor);

	System.out.printf("O valor está na posição:%d%n",loc);


}

}
}

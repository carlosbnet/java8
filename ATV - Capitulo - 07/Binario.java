import java.util.Arrays;

public class Binario
{


	public static void main(String[] args){


	int[] array = {3,2,5,2,9,1,6,4};

	Arrays.sort(array);

	int index =  Arrays.binarySearch(array,1);

	if (index >= 0){

	System.out.printf("Valor encontrado! seu indice é:%d%n",index);
	System.out.printf("o Valor do indice é:%d%n",array[index]);

	}

	else {

	System.out.println("Valor na encontro do array%n");

	}


	for(int x = 0; x < array.length; x++){

	System.out.printf("Valor do indice %d é: %d%n",x ,array[x]);
	}


	int[] arrays2 = new int[5];

	Arrays.fill(arrays2,2);


	for(int x = 0; x < arrays2.length;x++){

	System.out.printf("O valor do indice %d é: %d%n",x, arrays2[x]);

	}

}
}

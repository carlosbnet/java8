import java.util.Scanner;


public class Duplicatav2
{

	public static void main(String[] args){



	Scanner input = new Scanner(System.in);

	int[] array = new int[5];

	int i =0;

	while(i<array.length)
	{
		System.out.print("Digite o valor(10 - 100:)");
		int temp = input.nextInt();

		for(int counter=0;counter<array.length;counter++){

			if(array[counter]==temp){

			System.out.print("Valor repetido");

			}else{

				array[i] = temp;

			}


		}



		i++;
	     }


	}


}

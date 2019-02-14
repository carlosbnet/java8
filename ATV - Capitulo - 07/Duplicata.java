import java.util.Scanner;


public class Duplicata
{

	public static void main(String[] args){


 	int[] array = new int[5];

	Scanner input = new Scanner(System.in);

	for(int counter = 0; counter<array.length; counter++){ //Primeiro Laço para as 5 iterações

	System.out.print("Digite o valor: ");
	int temp = input.nextInt();		//Entrada dados

		for(int i = counter; i >=0; i--){ //laço para verificar os valores do array

		if(temp==array[i]){ //if pra fazer a comparação de cada elemento

			System.out.println("Valor já informado!");
			counter--; 	//O segredo: se nao colocar um decremento aqui fica aparecendo mais de um "Valor informado"
			break;		//sempre volta para o que estava não seguindo a diante
	          }else{

		    array[counter]=temp;

		  }
	        }
	}

	for(int cont = 0; cont < array.length; cont++){

		System.out.printf("Valor:%d%n",array[cont]);

	}
}

}

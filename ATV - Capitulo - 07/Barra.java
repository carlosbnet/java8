import java.util.Scanner;

public class Barra

{

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);

	int[] array = new int[10];

	System.out.println();
	System.out.println("--------------------Bem Vindo Ao Sistema!-------------------");
	System.out.println();

	System.out.print("Digite a quantidade de alunos da sala:");
	double quantTotal = input.nextDouble();
	System.out.println();

	for(int counter = 0; counter < 10; counter++){


		System.out.printf("Quantos alunos tirou: %02d ",counter*1+1);

		if(counter < 10){
		array[counter] = input.nextInt();
		}
	}

	System.out.println();
	System.out.printf("                Grafico da Turma");
	System.out.println();
	System.out.println("-----------------------------------------------");



	for(int counter = 0; counter < array.length; counter++){


		System.out.printf("%2d- ",counter*1+1);

		for(int index = 0; index < array[counter]; index++){

			System.out.print("=");

		}

	double porc = (double)array[counter]/quantTotal*100;

	System.out.printf("                               - %.1f%% |%n",porc);
	System.out.println();

	}

	System.out.println("-----------------------------------------------");


}
}

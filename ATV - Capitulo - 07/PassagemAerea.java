import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Arrays;

public class PassagemAerea
{

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);
	SecureRandom random = new SecureRandom();

	int[] Primeira = new int[5];
	int[] Segunda = new int[5];
	int A1 = 0;
	int A2 = 0;
	int classe =0;
	int poltrona = 0;
	int cont=0;
	int cont2=0;

	Arrays.fill(Primeira, 0);
	Arrays.fill(Segunda, 0);

	System.out.println("Sistema de Passagem Areas");

	System.out.println();

	do{

	System.out.println("1 - Primeira Classe");

	System.out.println("2 - Classe Economica");


	classe = input.nextInt();

// setar os campos do Arrys para 1 quando oculpados

	if(classe == 1){

	  if(cont<=4){

              for(int i = 0; i<5;i++){

	  	  if(Primeira[i]==0){

		   Primeira[i]  = 1;
		   poltrona = i;
		   cont++;
	           System.out.printf("Compra Realizada Com Sucesso, Numero da Poltrona: %d\n",poltrona);
		   break;

	 	  }
              }


	    }else{

		System.out.print("Primeira Classe sem vagas\n");

		}
	}


	if(classe == 2 ){

	 if(cont2<=4){

	   for(int i = 0; i<5; i++){

		if(Segunda[i]==0){

		Segunda[i] = 1;
		poltrona =  i;  // fala o numero da poltrona do cliente
		cont2++;
                System.out.printf("Compra Realizada Com Sucesso, Numero da Poltrona: %d\n",poltrona);
		break;

		}
       	    }
         }else {

		System.out.print("Segunda Classe sem vagas\n");

		}

}

//	for(int i = 0; i<5;i++){


//	System.out.printf("%d\t",Segunda[i]);

//}
}while(classe!=0);
}
}

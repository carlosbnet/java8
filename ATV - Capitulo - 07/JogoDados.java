import java.util.Scanner;
import java.security.SecureRandom;

public class JogoDados
{

	public static void main(String[] args)
	{

	int dado = 6;

	int valor1 = 0;

	int valor2 = 0;

	int result = 0;		//Variaveis para os valores do dado e posteriomente a soma

	double[] array = new double[12];


	Scanner input = new Scanner(System.in);

	SecureRandom random = new SecureRandom();


	System.out.print("Digite a quantidade: ");
	double quant = input.nextDouble();



	for(double i = 0; i<quant; i++)

	{

 	valor1 = 1 + random.nextInt(dado);

	valor2 = 1 + random.nextInt(dado);

	result = valor1 + valor2;



        array[result-1] += 1;


	}

	for(int m = 0; m < array.length; m++){


	System.out.printf("Quantidade de %d é: %f %n",m+1,array[m]);

	}


}
}


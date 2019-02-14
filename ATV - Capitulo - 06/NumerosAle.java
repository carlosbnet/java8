import java.util.Random;
//import java.security.SecureRandom;

public class NumerosAle
{

	public static void main(String[] args)
	{
	int valor1 = 0;
	int valor2 = 0;
	int valor3 = 0;
	int valor4 = 0;
	int valor5 = 0;
	int valor6 = 0;

	Random randomNumber = new Random();


	for (int counter=1; counter<=10000; counter++)
	{

	int valor = 1 + randomNumber.nextInt(6);

	System.out.printf("%d",valor);

	if (counter % 5 == 0)
	System.out.println();


	switch (valor)
	{
	case 1:
		valor1++;
	break;


	case 2:
		valor2++;
	break;

	case 3:
		valor3++;
	break;

	case 4:
		valor4++;
	break;

	case 5:
		valor5++;
	break;

	case 6:
		valor6++;
	break;

	}
	}
	
	System.out.printf("Quantas vezes saiu 1: %d%n",valor1);
	System.out.printf("Quantas vezes saiu 2: %d%n",valor2);
	System.out.printf("Quantas vezes saiu 3: %d%n",valor3);
	System.out.printf("Qauntas vezes saiu 4: %d%n",valor4);
	System.out.printf("Quantas vezes saiu 5: %d%n",valor5);
	System.out.printf("Qauntas vezes saiu 6: %d%n",valor6);
	}


}


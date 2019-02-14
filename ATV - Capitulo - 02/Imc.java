import java.util.Scanner;

public class Imc
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);

	double altura;
	double peso;
	double result;

	System.out.print("Digite seu peso:");
	peso = input.nextDouble();
	System.out.print("Digite sua altura:");
	altura = input.nextDouble();

		result =peso / (altura*altura);

	if (result < 17)
		System.out.printf("Valor:%.2f - Muito abaixo do peso%n",result);

	if (result >= 17 &&  result <= 18.49)
		System.out.printf("Valor: %.2f - Abaixo do Peso%n", result);

	if (result >= 18.50 && result <= 24.99)
		System.out.printf("O valor %.2f - Peso Normal%n", result);

	if (result >= 25.00 && result <= 29.99)
		System.out.printf("O valor %.2f - Acima do Peso%n", result);

	if (result >= 30.00 && result <= 34.99)
		System.out.printf("O valor %.2f - Obesidade 01%n", result);

	if (result >= 35 && result <= 39.99)
		System.out.printf("O valor %.2f - Obesidade 02 (Severa)%n", result);

	if (result >= 40.00)
		System.out.printf("O valor %.2f - Obesidade 03 Morbida%n");

}
}

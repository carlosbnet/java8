import java.util.Scanner;


public class Quilometragem
{
	public static void main(String[] args)
	{


	int contador = 0;
	int km = 0;
	int litros = 0;
	int kmTotal = 0;
	int litrosTotal = 0;
	int consumoTotal = 0;


	Scanner input = new Scanner(System.in);

	System.out.print("Insira os quilometros dirigidos(digite -1 para sair): ");
	km = input.nextInt();

	if (km != -1)
	{
	System.out.print("Insira a quantidade de litros: ");
	litros = input.nextInt();

	while (km != -1)
	{


		contador++;
		double consumo = (double)km / litros;
		kmTotal += km;
		litrosTotal += litros;
		System.out.printf("Consumo medio: %.2f%n KM/L", consumo);
		System.out.printf("Total de Quilometros: %d%n",kmTotal);
		System.out.printf("Total de Litros: %d%n", litrosTotal);


		System.out.print("Insira a quilometragem dirigida(digita -1 para sair): ");
		km = input.nextInt();

		if (km != -1)
		{
		System.out.print("Insira a quantidade de litros: ");
		litros = input.nextInt();
		}

	}
	}
}

}

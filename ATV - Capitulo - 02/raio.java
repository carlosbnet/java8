import java.util.Scanner;


public class raio
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);

	double raio;
	double diametro;
	double circu;
	double area;

	System.out.print("Digite o valor do raio:");
	raio = input.nextDouble();

	diametro = raio*2;
	circu = (2 * raio) * Math.PI;
	area = Math.PI * Math.pow(raio,2); 

	System.out.printf("O diamentro é:%.2f %n", diametro);
	System.out.printf("A circuferencia é:%.2f %n", circu);
	System.out.printf("O valor da area é;%.2f%n", area);
}
}

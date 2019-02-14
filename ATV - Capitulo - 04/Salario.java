import java.util.Scanner;

public class Salario
{
	public static void main(String[] args)
	{

	Scanner input = new Scanner(System.in);


	System.out.print("Insira o seu salario: ");
	double salario = input.nextInt();

	System.out.print("Insira a hora extra trabalhada; ");
	double hora = input.nextInt();


	double valorHoraExtra = salario/220;

	double horaExtra = (valorHoraExtra*0.5)+valorHoraExtra;

	double calcSalario = ((horaExtra*hora)+salario);

	System.out.printf("Valor da hora: %f%n",valorHoraExtra);

	System.out.printf("Valor da hora com 50: %f%n",horaExtra);

	System.out.printf("O valor do Salario total:%f%n ",calcSalario);



}
}

import java.util.Scanner;



public class DateTest
{
	public static void main(String[] agrs)
	{


	Scanner input = new Scanner(System.in);

	Date data1 = new Date(19,11,1990);

	data1.displayDate(data1);

	System.out.println("Digite a nova data de nacimento");
	System.out.print("Dia: ");
	int dia = input.nextInt();
	System.out.print("Mes: ");
	int mes = input.nextInt();
	System.out.print("Ano: ");
	int ano = input.nextInt();

	//data1.newDate(dia,mes,ano);

	//System.out.print("Essa é a primeira forma usando o metodo newDate");
	//data1.displayDate(data1);


	data1.setDia(dia);
	data1.setMes(mes);
	data1.setAno(ano);
	System.out.print("A outra maneira usando os Sets");
	data1.displayDate(data1);

}
}

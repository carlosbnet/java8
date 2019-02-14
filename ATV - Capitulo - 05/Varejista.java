import java.util.Scanner;

// pra melhorar o projeto pode ser fazer uns metodos nos cases do switch
// para deixar o codigo mais limpo e melhor desenpenho


public class Varejista
{

	private int quantVend;
	private double valorTotal;
	private double valorProd;
	Scanner input = new Scanner(System.in);

	public void setCalculo(double valorProd)
	{

	System.out.print("Digite a quantidade vendida:");
	quantVend = input.nextInt();
	valorTotal+= quantVend*valorProd;

	}

	public static void main(String[] args)
	{

	int numProd = 0;
	int quantVend = 0;
	double valorProd = 0;
	double valorTotal = 0;

	Scanner input = new Scanner(System.in);
	Varejista calculo = new Varejista();


	while (numProd !=-1)
	{
	System.out.print("Digite o Codigo do Produto: ");
	numProd =  input.nextInt();


	   switch (numProd)

	   {

	    case 1:
		valorProd = 2.98;
		calculo.setCalculo(valorProd);
            break;

	    case 2:
		valorProd = 4.50;
		calculo.setCalculo(valorProd);
	    break;

	    case 3:
		valorProd = 9.98;
		calculo.setCalculo(valorProd);
	    break;


	    case 4:
		valorProd = 4.49;
		calculo.setCalculo(valorProd);
	    break;

	    case 5:
		valorProd = 6.87;
		calculo.setCalculo(valorProd);
	    break;

	    default:
		System.out.println("O produto informada não  encontrado!");

		}

	}

	System.out.printf("O valor total dos produtos é:%.2f ",calculo.valorTotal);

}

}

public class ForAprimorado
{


	public static void main(String[] args)
	{

	double soma = 0;
	double result = 0;

	for(String i : args)
	{


	 soma += Double.parseDouble(i);

//	result += soma;

	}


	System.out.printf("O valor da soma é:%f ",soma);


}
}

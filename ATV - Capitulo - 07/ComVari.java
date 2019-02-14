public class ComVari
{


	private double produto = 1;


	public ComVari(double... valor)
	{

	   for(double i: valor)
	   {
		produto *= i;
	   }

	}


	public double getProduto()
	{

		return produto;

	}

}

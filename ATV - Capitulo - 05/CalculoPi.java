public class CalculoPi
{

	public static void main(String[] args)
	{

	double num = 4;
	double pi = 0;
	double termo = 0;

	for (int d=1; d<=3000000; d+=2)
	{



		if (termo%2==0)
		{
		   if (pi!=0)
		    {
		       pi += num/d;
		    }
		    else
		    {
			pi = num/d;
		    }

		}

		else if(termo%2==1)
		{
		    if(pi!=0)
		     {
		        pi -= num/d;
		     }
		     else
		     {
			pi = num/d;
		     }

		}

	termo++;

       }

  System.out.printf("O valor de PI é:%f%n ",pi);

}
}








public class Triplo
{

	public static void main(String[] args)
	{

	int a = 0;
	int b = 0;
	int m = 2;
	int n = 1;

	for (int c= 0;c<=500;++m,++n)
	{

	a = m*m - n*n;
	b = 2*m*n;
	c = m*m + n*n;

	System.out.printf("(%d,%d,%d)%n",a,b,c);

}
}
}

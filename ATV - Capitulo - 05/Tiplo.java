public class Triplo
{

	public static void main(String[] args)
	{

	int a = 0;
	int b = 0;
	int c = 0;
	int m = 2;
	int n = 1;

	for (int x; x<=500; ++x,++m,++n)
	{

	a = Math.pow(m,2)-Math.pow(n,2);

	System.out.printf("(%d,)",a);

}
}
}

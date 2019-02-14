import java.util.Scanner;

public class Comparacao2
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	int x;
	int y;
	int z;
	int soma, media, produto;
	System.out.print("Digite o primeiro valor:");
	x = input.nextInt();
	System.out.print("Digita o primeiro valor:");
	y = input.nextInt();
	System.out.print("Digite o terceiro valor:");
	z = input.nextInt();
	System.out.println("");
	soma = x + y + z;
	media = (x + y + z)/3;
	produto = x * y * z;

	System.out.printf("Valor da Soma:%d%n",soma);
	System.out.printf("Valor da Media:%d%n", media);
	System.out.printf("Valor do Produto:%d%n",produto);


}
}

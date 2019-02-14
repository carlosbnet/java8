import java.util.Scanner;


public class TestTiposEnum
{


	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int menu = 0;

	for(TipoEnum t : TipoEnum.values()){

	 System.out.println("Valores:" + t +" : "+ t.getValor());

	}



	TipoEnum tiposenum = TipoEnum.TARDE;

	System.out.println(tiposenum);
	System.out.println(tiposenum.getValor());
	System.out.println(tiposenum.name());

        menu = input.nextInt();

	


}


}

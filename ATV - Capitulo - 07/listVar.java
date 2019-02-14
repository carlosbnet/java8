public class listVar
{

	public static void main(String[] args)
	{

	double x = Double.parseDouble(args[0]);
	double y = Double.parseDouble(args[2]);
	String  operacao = args[1];



	if (args.length!=3){
		System.out.print("Expressão invalida, digite novamente!");
	}
	else {
		operador(operacao, x, y);

	}

}

	public static void operador(String operador, double x, double y)
	{


	switch (operador){

	case "+":
		System.out.printf("O Resultado é:%f%n",x+y);
	break;

	case "-":
		System.out.printf("O Resultado é:%f%n",x-y);
	break;

	case "*":
		System.out.printf("O Resultado é:%f%n",x*y);
	break;

	case "/":
		System.out.printf("O Resultado é:%f%n",x/y);
	break;

 	default:
		System.out.printf("Pelo visto vocé não usou o sinal cerreto, tente novamente!!");
	}

	}

}


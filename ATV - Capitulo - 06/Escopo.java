public class Escopo
{

     public static int x = 1;
     public int y = 2;


	public static void main(String[] args){

	Escopo exe1 = new Escopo();

	local();
	global();
	exe1.exe();

	System.out.println("O valor é: "+ exe1.exe());

	}

	public static void local(){

		int x = 2;
		System.out.printf("Variavel Local: %d%n", x);

	}

	public static void global(){

		Escopo.x +=3;
		System.out.printf("Variavel global: %d%n", x);
	}

	public  boolean  exe(){

	this.y +=10; 
	boolean y = false;

	System.out.printf("Valor do Exemplo:"+ y);
	System.out.printf("Valor do Exemplo: %d%n", this.y);
	return y;
	}



}

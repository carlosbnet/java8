public enum  TipoEnum{

	MANHA(1),
	TARDE(2),
	NOITE(3);


	private final int valor;

	TipoEnum(int valor){

	this.valor = valor;

	}

	public int getValor(){

	return valor;

	}

}

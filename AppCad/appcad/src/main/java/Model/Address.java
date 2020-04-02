package Model;

public class Address {

	private int id_client;
	private String logr_rua = null;
	private String logr_bairro = null;
	private int logr_numero;
	private String logr_cidade = null;
	private String logr_estado = null;
	
	
	
	
	public Address( String logr_rua, String logr_bairro, int logr_numero, String logr_cidade,
			String logr_estado) {
		super();
		
		this.logr_rua = logr_rua;
		this.logr_bairro = logr_bairro;
		this.logr_numero = logr_numero;
		this.logr_cidade = logr_cidade;
		this.logr_estado = logr_estado;
		
	}




	public int getId_client() {
		return id_client;
	}




	public void setId_client(int id_client) {
		this.id_client = id_client;
	}




	public String getLogr_rua() {
		return logr_rua;
	}




	public void setLogr_rua(String logr_rua) {
		this.logr_rua = logr_rua;
	}




	public String getLogr_bairro() {
		return logr_bairro;
	}




	public void setLogr_bairro(String logr_bairro) {
		this.logr_bairro = logr_bairro;
	}




	public int getLogr_numero() {
		return logr_numero;
	}




	public void setLogr_numero(int logr_numero) {
		this.logr_numero = logr_numero;
	}




	public String getLogr_cidade() {
		return logr_cidade;
	}




	public void setLogr_cidade(String logr_cidade) {
		this.logr_cidade = logr_cidade;
	}




	public String getLogr_estado() {
		return logr_estado;
	}




	public void setLogr_estado(String logr_estado) {
		this.logr_estado = logr_estado;
	}
	
	
	
	
	
	
	
	
	
}

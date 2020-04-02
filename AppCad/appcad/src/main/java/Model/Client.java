package Model;

import java.util.Date;

public class Client {

	private int idClient;
	private String name = null;
	private Date date_of_birth = null;
	private String cpf = null;
	private String telephone = null;
	private String email = null;
	private Address address = null;
	
	
	public Client(String name, Date date_of_birth, String cpf, String telephone, String email, Address address) {
	
		this.name = name;
		this.date_of_birth = date_of_birth;
		this.cpf = cpf;
		this.telephone = telephone;
		this.email = email;
		this.address = address;
		
	}


	public int getIdClient() {
		return idClient;
	}


	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDate_of_birth() {
		return date_of_birth;
	}


	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
	
	
	
}

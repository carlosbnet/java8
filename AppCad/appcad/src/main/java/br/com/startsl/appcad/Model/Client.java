package br.com.startsl.appcad.Model;

import java.util.Date;

public class Client {

	private Integer idClient;
	private String name;
	private Date date_of_birth;
	private String cpf;
	private String telephone;
	private String email;
	private Address address;
	
	


	public Integer getIdClient() {
		return idClient;
	}


	public void setIdClient(Integer idClient) {
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


	
	@Override
	public String toString() {
			
		return "ID:"+getIdClient()+",Nome:"+getName()+",CPF: "+getCpf()+" Endereço: "+getAddress().getLogr_estado();
	}
	
	
}

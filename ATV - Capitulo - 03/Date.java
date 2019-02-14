public class Date
{

  private int dia;
  private int mes;
  private int ano;


     public Date(int dia, int mes, int ano)
     {
       this.dia = dia;
       this.mes = mes;
       this.ano = ano;
     }



	//Outra possivel solucao

	public void newDate(int dia, int mes, int ano)
	{
           this.dia = dia;
           this.mes = mes;
           this.ano = ano;
	}


	//Metodos Sets

	public void setDia(int dia)
	{
	 this.dia = dia;
	}
	public void setMes(int mes)
	{
	 this.mes = mes;
	}
	public void setAno(int ano)
	{
	 this.ano = ano;
	}

	//Metodo Gets

	public int getDia()
	{
	 return dia;
	}
	public int getMes()
	{
	 return mes;
	}
	public int getAno()
	{
	 return ano;
	}


	// Metodo display

	public void displayDate(Date dispalyToDate)
	{
	System.out.printf("%nSua idade é: %d/%d/%d%n%n", dia, mes, ano);
	}


}


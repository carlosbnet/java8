
public class Employee
{

	private String nome;
	private String sobrenome;
	private double salario;
	private double salAnual;


	public Employee(String nome, String sobrenome, double salario)
	{
	    this.nome = nome;
	    this.sobrenome = sobrenome;

   	  if (salario <= 0)
            {
              System.out.print("O Salario é nagativo, então você não vai ganhar nada!");
            }
          else
            {
              this.salario = salario;
	      salAnual = salario * 12;
            }
	}

	//Metodos Sets

	public void setNome(String nome)
	{
	   this.nome = nome;
	}

	public void setSobreNome(String sobrenome)
	{
	  this.sobrenome = sobrenome;
	}

	public void setSalario(double salario)
	{
	  if (salario <= 0)
	    {
	      System.out.print("O Salario é nagativo, então você não vai ganhar nada!");
	    }
	  else
	    {
              this.salario = salario;
	      salAnual = salario * 12;
	    }
  	}

	public void setAumento(double porcentagem)
	{
	   salario = ((salario * porcentagem)/100)+salario;
	}


	//Metodos Gets

	public String getNome()
	{
	 return nome;
	}

	public String getSobreNome()
	{
	 return sobrenome;
	}

	public double getSalario()
	{
	 return salario;
	}

	public double getSalAnual()
	{
	 return salAnual;
	}


}


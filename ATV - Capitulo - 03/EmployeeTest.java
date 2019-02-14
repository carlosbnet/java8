import java.util.Scanner;


public class EmployeeTest
{

	public static void main(String[] agrs)
	{


	Scanner input = new Scanner(System.in);


	Employee employee1 = new Employee("Carlos","Vandson",700.52);
	Employee employee2 = new Employee("loide","Rose", 880.00);


	//Metodo longo, voce pode resumir colocando todos os comandos na classe Employee e so chamando daqui!
	System.out.printf("%nO Funcionario: %s %s Salario: %.2f por mês!%n", employee1.getNome(),employee1.getSobreNome(), employee1.getSalario());
	System.out.printf("%nO funcionario: %s %s Salario: %.2f por mês!%n%n", employee2.getNome(),employee2.getSobreNome(), employee2.getSalario());
	System.out.printf("%nO Funcionario: %s %s Ganha anualmente: %.2f por mês!%n", employee1.getNome(),employee1.getSobreNome(), employee1.getSalAnual());


	System.out.printf("Digite o novo salario do Funcionario %s %s:", employee1.getNome(),employee1.getSobreNome());
	double newSalario = input.nextDouble();

	employee1.setSalario(newSalario);


	System.out.printf("%nNovo Salario do funcionario %s %s é: %.2f%n%n", employee1.getNome(), employee1.getSobreNome(), employee1.getSalario());


	System.out.printf("%nInsira o aumento (em porcentagem) do funcionario %s %s: " ,employee1.getNome(), employee1.getSobreNome());
	double aument = input.nextDouble();

	employee1.setAumento(aument);

	System.out.printf("%nNovo Salario do funcionario %s %s é: %.2f%n%n", employee1.getNome(), employee1.getSobreNome(), employee1.getSalario());









}
}

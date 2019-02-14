import java.util.Scanner;               
                
                
public class Ejercicio4_18              
                
{ // Abre la clase Ejercicio4_18           
                
public void Recibe()              
{ // Abre metodo recibe            
                
                
int numeroCuenta;               
double saldoInicio;               
double depositos;               
double cargos;               
double limiteCredito;               
                
                
Scanner entrada = new Scanner(System.in);            
                
System.out.println("\nPor favor introduzca el numero de cuenta del cliente o -1 para terminar: \n");   
numeroCuenta = entrada.nextInt();              
                
while ( -1 != numeroCuenta)            
{ // Abre while             
System.out.println("\nPor favor introduzca el saldoInicial: \n");           
saldoInicio = entrada.nextDouble();              
                
System.out.println("\nPor favor introduzca los depositos hechos por el cliente: \n");       
depositos = entrada.nextDouble();              
                
System.out.println("\nPor favor introduzca los cargos hechos al cliente: \n");        
cargos = entrada.nextDouble();              
                
System.out.println("\nPor favor introduzca el limite de credito para el cliente: \n");      
limiteCredito = entrada.nextDouble();              
                
                
double x = Retorna(saldoInicio, depositos, cargos);           
if( x - limiteCredito > 0)           
System.out.println("\nEl credito se ha excedido.");            
                
System.out.println("\nPor favor introduzca el numero de cuenta del cliente o -1 para terminar: \n");   
numeroCuenta = entrada.nextInt();              
                
} // Cierra while             
} // Cierra el metodo Recibe           
                
public double Retorna( double saldoInic, double pagos, double cargos)        
{ // Abre metodo Retorna            
return saldoInic + pagos - cargos;           
} //Cierra metodo retorna             
} // Cierra la clase Ejercicio4_18           

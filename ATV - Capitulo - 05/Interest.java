public class Interest
{
   public static void juros (double rate)
   {
      double amount;
      double principal = 1000.0;
      
      //exibe cabeçalho
            System.out.printf("%s%20s \n","Year", "Amount on deposit");
            //calcula quantidade de depósito para cada um dos dez anos
            for ( int year = 1; year <= 10; year++)
            {
               //calcular nova quantidade durante ano especificado
               amount = principal * Math.pow( 1.0 + rate, year );
               
               //exibe o ano e a quantidade
               System.out.printf( "%4d%,20.2f\n", year, amount);
               
            }//final for
   }
   
   public static void main( String[] args)
   {
      juros(0.05);
      juros(0.06);
      juros(0.07);
      juros(0.08);
      juros(0.09);
      juros(0.10);      
      
   }//final main

}//final class Interest

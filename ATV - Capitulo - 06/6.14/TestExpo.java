

import java.util.Scanner;


 
public class TestExpo {

    
        public static void main(String[] args){

            Scanner output = new Scanner(System.in);
            Expo exponencial = new Expo();


        System.out.println("Digite a Base");
        int base = output.nextInt();
            
        System.out.println("Digite o Expoente");
        int expoente = output.nextInt();

        
        exponencial.integerPower(base, expoente);


        System.out.printf("O valor da Exponenciacao e: %d",exponencial.getResult());

        }


}
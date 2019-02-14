
/**
 * Exponencial
 */
public class Expo {

  
    private int result =1; //Variavel resultado




    public void integerPower(int base, int expoente) {

    
        
        for (int x = 0; x < expoente; x++) {

            result *= base;
        }

    }



    /**
     * @return the result
     */
    public int getResult() {
        return result;
    }

  



    
}
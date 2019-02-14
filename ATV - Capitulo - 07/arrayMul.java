//g. 7.17: InitArray.java
// Initializing two-dimensional arrays.

public class arrayMul 
{
   // create and output two-dimensional arrays
   public static void main(String[] args)
   {
      int total = 0;
      
      int[][] array = {{1,5,6},{5,6,8}};
      
      
     for(int linha = 0;linha < array.length;linha++) {
    	 
    	 for(int coluna = 0; coluna < array[linha].length; coluna++) {
    		 total += array[linha][coluna]; 
    	 }
    	 
     }
      
   }     
       
   }

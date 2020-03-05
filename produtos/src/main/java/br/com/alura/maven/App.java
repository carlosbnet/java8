package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Produto produto =  new Produto("Bala do juquinha",0.15);

        System.out.println(produto.getNome()+""+produto.getPreco());

        System.out.println( "Hello World!" );
    }
}

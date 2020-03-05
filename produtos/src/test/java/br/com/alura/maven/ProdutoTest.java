package br.com.alura.maven;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProdutoTest {


    @Test
    public void verificaImposto(){
        Produto bala = new Produto("bALINHA",0.10);
        assertEquals(0.11,bala.getPrecoImposto(),0.00001);
    }


}


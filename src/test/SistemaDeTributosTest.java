package test;

import org.junit.Test;
import profissoes.taxista.Taxista;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;

public class SistemaDeTributosTest {
    @Test
    public void quantTaxistas(){
        Taxista t1 = new Taxista("Victor", "123", 100, 600, 500000, 500000);
        Taxista t2 = new Taxista("Rafa", "123", 70, 900, 40000, 10000); 
        List <Taxista> t = new ArrayList<>();
        t.add(t2);
        t.add(t1);
        assertEquals((int) 2, t.size());
    }
    // public void quantCaminhoneiros(){
    //     Caminhoneiro c1 = new Caminhoneiro("Pablo", "222", 1300, 2000, 500000, 50000);
    //     Caminhoneiro c2 = new Caminhoneiro("Alberto", "123", 700, 600, 5000, 5000);
    // }





    // public void quantidadeTributos(){
    // @Test
    // Taxista t1 = new Taxista("Victor", "123", 100, 600, 500000, 500000);
    // Taxista t2 = new Taxista("Rafa", "123", 70, 900, 40000, 10000);
    // assert.assertEquals(quantidadeTributos();, t2);


    // }
}

package test;

import org.junit.Assert;
import org.junit.Test;

import profissoes.taxista.Taxista;

public class TaxistaTest {
    @Test
    public void nomeTaxista(){
        Taxista t1 = new Taxista("Victor", "123", 100, 600, 500000, 500000);
        Taxista t2 = new Taxista("Rafa", "123", 70, 900, 40000, 10000);
        Taxista t3 = new Taxista("Dude", "123", 50, 400, 50000, 5000);

    Assert.assertEquals(t1.getNome(), "Victor");
    Assert.assertEquals(t2.getNome(), "Rafa");
    Assert.assertEquals(t3.getNome(), "Dude");
}
    @Test
    public void impostoTaxista(){
        Taxista t1 = new Taxista("Victor", "123", 100, 600, 500000, 500000);
    Assert.assertEquals(((int)t1.calcularImpostoTaxista()), 44);
}
    @Test
    public void bensTaxista(){
        Taxista t1 = new Taxista("Victor", "123", 100, 600, 500000, 500000); 
        Assert.assertEquals(((int)t1.calcularTotaldeBens()), 1000000);
    }
    @Test
    public void TaxistaToString(){
        Taxista t1 = new Taxista("Victor", "123", 100, 600, 500000, 500000);   
        Taxista t2 = new Taxista("Rafa", "111", 70, 900, 40000, 10000);
        Taxista t3 = new Taxista("Dude", "122", 50, 400, 50000, 5000);
        
        Assert.assertEquals(t1.toString(), "\nNome: Victor\nID: 123");
        Assert.assertEquals(t2.toString(), "\nNome: Rafa\nID: 111");
        Assert.assertEquals(t3.toString(), "\nNome: Dude\nID: 122");
    }
}

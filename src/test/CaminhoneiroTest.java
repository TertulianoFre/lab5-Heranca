package test;
import org.junit.Assert;
import org.junit.Test;
import profissoes.caminhoneiro.Caminhoneiro;

public class CaminhoneiroTest {
    @Test
    public void nomeCaminhoneiro(){
        Caminhoneiro c1 = new Caminhoneiro("Pablo", "222", 1300, 2000, 500000, 50000);
        Caminhoneiro c2 = new Caminhoneiro("Alberto", "123", 700, 600, 5000, 5000);
        Caminhoneiro c3 = new Caminhoneiro("Cassio", "111", 400, 500, 4500, 5500);

    Assert.assertEquals(c1.getNome(), "Pablo");
    Assert.assertEquals(c2.getNome(), "Alberto");
    Assert.assertEquals(c3.getNome(), "Cassio");
}
    @Test
    public void impostoCaminhoneiro(){
        Caminhoneiro c1 = new Caminhoneiro("Pablo", "222", 1300, 2000, 500000, 50000);  
    Assert.assertEquals(((int)c1.calcularImpostoCaminhoneiro()), 129480);
}
    @Test
    public void bensCaminhoneiro(){
        Caminhoneiro c1 = new Caminhoneiro("Pablo", "222", 1300, 2000, 500000, 50000);  
        Assert.assertEquals(((int)c1.calcularTotaldeBens()), 550000);
    }
    @Test
    public void CaminhoneiroToString(){
        Caminhoneiro c1 = new Caminhoneiro("Pablo", "222", 1300, 2000, 500000, 50000);  
        Assert.assertEquals(c1.toString(), "\nNome: Pablo\nID: 222");
    }
}

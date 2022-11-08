package test;

import org.junit.Assert;
import org.junit.Test;
import profissoes.medico.Medico;



public class MedicoTest {
    @Test
    public void nomeMedico(){
    Medico m2 = new Medico("Lucas", "121", 800,8000,4000);
    Medico m3 = new Medico("Heros", "122", 750,5000,5000);
    Medico m4 = new Medico("Bruno", "123", 950,4500, 6000);

    Assert.assertEquals(m2.getNome(), "Lucas");
    Assert.assertEquals(m3.getNome(), "Heros");
    Assert.assertEquals(m4.getNome(), "Bruno");
}
    @Test
    public void impostoMedico(){
        Medico m2 = new Medico("Lucas", "121", 800,8000,4000);  
    Assert.assertEquals(((int)m2.calcularImpostoMedico()), 8000);
}
    @Test
    public void bensMedico(){
        Medico m2 = new Medico("Lucas", "121", 800,8000,4000);  
        Assert.assertEquals(((int)m2.calcularTotaldeBens()), 12000);
    }
    @Test
    public void MedicoToString(){
        Medico m2 = new Medico("Lucas", "121", 800,8000,4000);   
        Assert.assertEquals(m2.toString(), "\nNome: Lucas\nID: 121");
    }
}

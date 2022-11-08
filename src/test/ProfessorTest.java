package test;
import org.junit.Assert;
import org.junit.Test;
import profissoes.professor.Professor;

public class ProfessorTest {
    @Test
    public void nomeProfessor(){
        Professor p1 = new Professor("Sabrina", "123", 100000, 50000, 500, 12000);
        Professor p2 = new Professor("Fabio", "111", 8000, 4000, 150, 1212);
        Professor p3 = new Professor("Marcos", "133", 7000, 6000, 200, 2400);

    Assert.assertEquals(p1.getNome(), "Sabrina");
    Assert.assertEquals(p2.getNome(), "Fabio");
    Assert.assertEquals(p3.getNome(), "Marcos");
}
    @Test
    public void impostoProfessor(){
        Professor p1 = new Professor("Sabrina", "123", 100000, 50000, 500, 12000); 
    Assert.assertEquals(((int)p1.calcularImpostoProfessor()), 2150);
}
    @Test
    public void bensProfessor(){
        Professor p2 = new Professor("Fabio", "111", 8000, 4000, 150, 1212); 
        Assert.assertEquals(((int)p2.calcularTotaldeBens()), 12000);
    }
    @Test
    public void ProfessorToString(){
        Professor p1 = new Professor("Sabrina", "123", 100000, 50000, 500, 12000);
        Professor p2 = new Professor("Fabio", "111", 8000, 4000, 150, 1212);
        Professor p3 = new Professor("Marcos", "133", 7000, 6000, 200, 2400);
        Assert.assertEquals(p2.toString(), "\nNome: Fabio\nID: 111");
        Assert.assertEquals(p1.toString(), "\nNome: Sabrina\nID: 123");
        Assert.assertEquals(p3.toString(), "\nNome: Marcos\nID: 133");
        
    }
}

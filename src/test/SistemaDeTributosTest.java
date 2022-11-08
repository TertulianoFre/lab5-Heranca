package test;

import org.junit.Test;

import profissoes.caminhoneiro.Caminhoneiro;
import profissoes.medico.Medico;
import profissoes.professor.Professor;
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
    @Test
     public void quantCaminhoneiros(){
            Caminhoneiro c1 = new Caminhoneiro("Pablo", "222", 1300, 2000, 500000, 50000);
            Caminhoneiro c2 = new Caminhoneiro("Alberto", "123", 700, 600, 5000, 5000);
            List <Caminhoneiro> c = new ArrayList<>();
            c.add(c2);
            c.add(c1);
         assertEquals((int) 2, c.size());
        }
     @Test
         public void quantProfessores(){
            Professor p1 = new Professor("Sabrina", "123", 100000, 50000, 500, 12000);
            Professor p2 = new Professor("Fabio", "111", 8000, 4000, 150, 1212);
            Professor p3 = new Professor("Marcos", "133", 7000, 6000, 200, 2400);
            List <Professor> p = new ArrayList<>();
            p.add(p2);
            p.add(p1);
            p.add(p3);
         assertEquals((int) 3, p.size());
        }
    @Test
        public void quantMedicos(){
            Medico m1 = new Medico("Samuel", "111", 2000, 30000,40000);
            Medico m2 = new Medico("Lucas", "121", 800,8000,4000);
            List <Medico> m = new ArrayList<>();
            m.add(m2);
            m.add(m1);
     
         assertEquals((int) 2, m.size());
        }
}

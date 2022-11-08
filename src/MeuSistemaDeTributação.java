import profissoes.caminhoneiro.Caminhoneiro;
import profissoes.medico.Medico;
import profissoes.professor.Professor;
import profissoes.taxista.Taxista;
import sistema.SistemaDeTributos;

public class MeuSistemaDeTributação {
    public static void main(String[] args) throws Exception {

        // Instacia do Sistema de Tributos
        SistemaDeTributos sistema = new SistemaDeTributos();

        // Instanciando Taxistas
        Taxista t1 = new Taxista("Victor", "123", 100, 600, 500000, 500000);
        Taxista t2 = new Taxista("Rafa", "123", 70, 900, 40000, 10000);
        Taxista t3 = new Taxista("Dude", "123", 50, 400, 50000, 5000);
        Taxista t4 = new Taxista("GG", "123", 80, 750,40000, 4000);
        Taxista t5 = new Taxista("ASD", "123", 110, 850, 55000, 5500);
        
        //Adicionandop Taxistas a lista.
        sistema.add(t1);
        sistema.add(t2);
        sistema.add(t3);
        sistema.add(t4);
        sistema.add(t5);

        //Instanciando Caminhoneiros
        Caminhoneiro c1 = new Caminhoneiro("Pablo", "222", 1300, 2000, 500000, 50000);
        Caminhoneiro c2 = new Caminhoneiro("Alberto", "123", 700, 600, 5000, 5000);
        Caminhoneiro c3 = new Caminhoneiro("Cassio", "111", 400, 500, 4500, 5500);
        Caminhoneiro c4 = new Caminhoneiro("Julho", "333", 400, 550, 6000, 4500);

        //Adicionandop Caminhoneiros a lista.
        sistema.add(c1);
        sistema.add(c2);
        sistema.add(c3);
        sistema.add(c4);
        
        //Instanciando Medicos
        Medico m1 = new Medico("Samuel", "111", 2000, 30000,40000);
        Medico m2 = new Medico("Lucas", "121", 800,8000,4000);
        Medico m3 = new Medico("Heros", "122", 750,5000,5000);
        Medico m4 = new Medico("Bruno", "123", 950,4500, 6000);

        //Adicionandop Medicos a lista.
        sistema.add(m1);
        sistema.add(m2);
        sistema.add(m3);
        sistema.add(m4);
        
        //Instanciando Professores
        Professor p1 = new Professor("Sabrina", "123", 100000, 50000, 500, 12000);
        Professor p2 = new Professor("Fabio", "111", 8000, 4000, 150, 1212);
        Professor p3 = new Professor("Marcos", "133", 7000, 6000, 200, 2400);
        Professor p4 = new Professor("Daniel", "222", 
        5000, 5000, 180, 1800);

        //Adicionandop Professores a lista.
        sistema.add(p1);
        sistema.add(p2);
        sistema.add(p3);
        sistema.add(p4);

        System.out.println("-------------------------EXIBIR IMPOSTOS DE CONTRIBUINTE-----------------------");
        System.out.println(sistema.exibirImpostoTaxista(0));
        System.out.println(sistema.exibirImpostoCaminhoneiro(0));
        System.out.println(sistema.exibirImpostoMedico(0));
        System.out.println(sistema.exibirImpostoProfessor(0));

        System.out.println("---------------------EXIBINDO TODAS INFORMAÇÕES -> TAXISTAS-------------------\n");
        System.out.println("Quantidade de Taxistas Cadastrados: " + sistema.quantTaxistasContrib());

        for(int i = 0; i < sistema.quantTaxistasContrib(); i++){
            System.out.println(sistema.getTaxista(i));
            System.out.println("\n******************************************************************************");
        }

        System.out.println("---------------------EXIBINDO TODAS INFORMAÇÕES -> CAMINHONEIROS-------------------\n");
        System.out.println("Quantidade de Caminhoneiros Cadastrados: " + sistema.quantCaminhoneirosContrib());

        for(int i = 0; i < sistema.quantCaminhoneirosContrib(); i++){
            System.out.println(sistema.getCaminhoneiro(i));
            System.out.println("\n******************************************************************************");
        }
        
        System.out.println("---------------------EXIBINDO TODAS INFORMAÇÕES -> PROFESSORES-------------------\n");
        System.out.println("Quantidade de Professores Cadastrados: " + sistema.quantProfessoresContrib());

        for(int i = 0; i < sistema.quantProfessoresContrib(); i++){
            System.out.println(sistema.getProfessor(i));
            System.out.println("\n******************************************************************************");
        }
        
        System.out.println("---------------------EXIBINDO TODAS INFORMAÇÕES -> MEDICOS-------------------\n");
        System.out.println("Quantidade de Medicos Cadastrados: " + sistema.quantMedicosContrib());

        for(int i = 0; i < sistema.quantMedicosContrib(); i++){
            System.out.println(sistema.getMedico(i));
            System.out.println("\n******************************************************************************");
        }

        System.out.println("\n-------------------EXIBINDO CONTRIBUINTES COM RIQUEZA ACIMA DA MÉDIA-----------------\n");
        System.out.println(sistema.UsuariosPatrimonioAcimaDaMedia());


        
        

    }
}

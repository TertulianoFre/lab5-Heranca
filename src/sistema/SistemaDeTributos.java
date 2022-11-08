package sistema;

import java.util.ArrayList;
import java.util.List;

import profissoes.caminhoneiro.Caminhoneiro;
import profissoes.medico.Medico;
import profissoes.professor.Professor;
import profissoes.taxista.Taxista;

public class SistemaDeTributos {
    private List<Taxista> taxistas;
    private List<Caminhoneiro> caminhoneiros;
    private List<Medico> medicos;
    private List<Professor> professores;
    private List<Object> patrimonioAcimaDaMedia;
    
    private double mediaTodosTaxistas;
    private double mediaTodosCaminhoneiros;
    private double mediaTodosMedicos;
    private double mediaTodosProfessores;
    
    public SistemaDeTributos(){
        taxistas = new ArrayList<Taxista>();
        caminhoneiros = new ArrayList<Caminhoneiro>();
        medicos = new ArrayList<Medico>();
        professores = new ArrayList<Professor>();
        patrimonioAcimaDaMedia = new ArrayList<>();
    }

    public int quantContribuintesRicos(){
        return patrimonioAcimaDaMedia.size();
    }
    public int quantTaxistasContrib(){
        return taxistas.size();
    }
    public int quantCaminhoneirosContrib(){
        return caminhoneiros.size();
    }
    public int quantMedicosContrib(){
        return medicos.size();
    }
    public int quantProfessoresContrib(){
        return professores.size();
    }
    
    public boolean add(Object t) {
        if(t.getClass().equals(Taxista.class)){
            for(Taxista tax : taxistas) {
                if(t.equals(tax)) {
                    return false;
                }
            }
            taxistas.add((Taxista) t);
            return true;

        }else if(t.getClass().equals(Caminhoneiro.class)){
            for(Caminhoneiro c : caminhoneiros) {
                if(t.equals(c)) {
                    return false;
                }
            }
            caminhoneiros.add((Caminhoneiro) t);
            return true;

        }else if(t.getClass().equals(Medico.class)){
            for(Medico m : medicos) {
                if(t.equals(m)) {
                    return false;
                }
            }
            medicos.add((Medico) t);
            return true;

        }else {
            for(Professor p : professores) {
                if(t.equals(p)) {
                    return false;
                }
            }
            professores.add((Professor) t);
            return true;
        }
	}

    private double calcularMedia(Object j){
        if(j.getClass().equals(Taxista.class)){
            for(Taxista t : taxistas){
                mediaTodosTaxistas += (t.getCarroProprio() + t.getCasaPropria());

            }
            return mediaTodosTaxistas / taxistas.size();
        }else if(j.getClass().equals(Caminhoneiro.class)){
            for(Caminhoneiro c : caminhoneiros){
                mediaTodosCaminhoneiros += (c.getCasaPropria() + c.getCarroProprio());
            }
            return mediaTodosCaminhoneiros / caminhoneiros.size();
        }else if(j.getClass().equals(Medico.class)){
            for(Medico m : medicos){
                mediaTodosMedicos += (m.getCasaPropria() + m.getCarroProprio());
            }
            return mediaTodosMedicos / medicos.size();
        }else {
            for(Professor p : professores){
                mediaTodosProfessores += (p.getCasaPropria() + p.getCarroProprio());
            }
            return mediaTodosProfessores / medicos.size();
        }
    }

    public String calcularPatrimonio(Object t){
        if(t.getClass().equals(Taxista.class)){
            if(((Taxista) t).calcularTotaldeBens() > (calcularMedia(t) + (calcularMedia(t) / 2))){
                patrimonioAcimaDaMedia.add(t);
                return "Patrimônio Acima da Média";
            }else{
                return "Patrimonio em Média em Relação a todos os Taxistas";
            }
        }else if(t.getClass().equals(Caminhoneiro.class)){
            if(((Caminhoneiro) t).calcularTotaldeBens() > (calcularMedia(t) + calcularMedia(t) / 2 )){
                patrimonioAcimaDaMedia.add(t);
                return "Patrimônio Acima da Média";
            }else{
                return "Patrimonio em Média em Relação a todos os Caminhoneiros";
            }
        }else if(t.getClass().equals(Medico.class)){
            if(((Medico) t).calcularTotaldeBens() > (calcularMedia(t) + calcularMedia(t) / 2 )){
                patrimonioAcimaDaMedia.add(t);
                return "Patrimônio Acima da Média";
            }else{
                return "Patrimonio em Média em Relação a todos os Medicos";
            }
        }else{
            if(((Professor) t).calcularTotaldeBens() > (calcularMedia(t) + calcularMedia(t) / 2 )){
                patrimonioAcimaDaMedia.add(t);
                return "Patrimônio Acima da Média";
            }else{
                return "Patrimonio em Média em Relação a todos os Professores";
            }
        }
    }
    
    public String exibirImpostoTaxista(int i){
        return taxistas.get(i).toString() + "\nTotal de Impostos a Pagar: R$ " + taxistas.get(i).calcularImpostoTaxista() + 
        "\nTaxa de Imposto = 0.5 por passageiro atendido." +
        "\nDesconto TAXISTA = 0.01 por KM Rodados.\n";
    }
    
    public double impostosTaxista(int i) {
        return this.taxistas.get(i).calcularImpostoTaxista();
    }

    public String getTaxista(int i) {
		return taxistas.get(i).exibirInfostaxista() + "\nIndicador de Riquesa: " + calcularPatrimonio(taxistas.get(i)) + 
        "\n\nTotal de Impostos a Pagar: R$ " + impostosTaxista(i);
        
	}
    public String exibirImpostoCaminhoneiro(int i){
        return caminhoneiros.get(i).toString() + "\nTotal de Impostos a Pagar: R$ " + caminhoneiros.get(i).calcularImpostoCaminhoneiro() + 
        "\nTaxa de Imposto = 500 até 10 toneladas carregagas e mais 100 reais por tonelada que ultrapasse o limite de 10 toneladas." +
        "\nDesconto CAMINHONEIRO = 0.01 por KM Rodados.\n";
    }
    
    public double impostosCaminhoneiro(int i) {
        return this.caminhoneiros.get(i).calcularImpostoCaminhoneiro();
    }

    public String getCaminhoneiro(int i) {
		return caminhoneiros.get(i).exibirInfoscaminhoneiros() + "\nIndicador de Riquesa: " + calcularPatrimonio(caminhoneiros.get(i)) + 
        "\n\nTotal de Impostos a Pagar: R$ " + impostosCaminhoneiro(i);
        
	}
    public String exibirImpostoMedico(int i){
        return medicos.get(i).toString() + "\nTotal de Impostos a Pagar: R$ " + medicos.get(i).calcularImpostoMedico() + 
        "\nTaxa de Imposto = 10R$ por paciente atendido no ano.";
    }
    
    public double impostosMedico(int i) {
        return this.medicos.get(i).calcularImpostoMedico();
    }

    public String getMedico(int i) {
		return medicos.get(i).exibirInfosmedico() + "\nIndicador de Riquesa: " + calcularPatrimonio(medicos.get(i)) + 
        "\n\nTotal de Impostos a Pagar: R$ " + impostosMedico(i);
        
	}
    public String exibirImpostoProfessor(int i){
        return professores.get(i).toString() + "\nTotal de Impostos a Pagar: R$ " + professores.get(i).calcularImpostoProfessor() + 
        "\nTaxa de Imposto = 5% para quem ganha até 1 salário mínimo, 10% até 5 salários mínimos e 20% acima de 5 salários mínimos." +
        "\nDesconto PROFESSOR = 50% das despesas totais com material didático.\n";
    }
    
    public double impostosProfessor(int i) {
        return this.professores.get(i).calcularImpostoProfessor();
    }

    public String getProfessor(int i) {
		return professores.get(i).exibirInfosprofessor() + "\nIndicador de Riquesa: " + calcularPatrimonio(professores.get(i)) + 
        "\n\nTotal de Impostos a Pagar: R$ " + impostosProfessor(i);     
	}

    public List<Object> getPatrimonioAcimaDaMedia() {
        return patrimonioAcimaDaMedia;
    }
    
    public String UsuariosPatrimonioAcimaDaMedia(){
        List<Object> lista = getPatrimonioAcimaDaMedia();
        List<Object> listaAux = new ArrayList<>();

        for(int i=0; i < lista.size(); i++){
            listaAux.add(lista.get(i) + "\n");
        }
        return listaAux.toString();
    }

}

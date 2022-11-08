package profissoes.medico;

import contribuinte.Contribuinte;

public class Medico extends Contribuinte{
    private double numPacientes;
    private double casaPropria, carroProprio;
    private double taxaImposto;
    


    public Medico(String nome, String id, double numeroPacientesAno, double casaPropria, double carroProprio){
        super(nome, id);
        this.numPacientes = numeroPacientesAno;
        this.casaPropria = casaPropria;
        this.carroProprio = carroProprio;
    }
    public Medico(String nome, String id, double numeroPacientesAno){
        super(nome, id);
        this.numPacientes = numeroPacientesAno;
        this.casaPropria = 0.0;
        this.carroProprio = 0.0;
    }
    public double calcularImpostoMedico(){
        taxaImposto = numPacientes * 10;
        return taxaImposto;
    }
    public double calcularTotaldeBens(){
        return carroProprio + casaPropria;
    }

    public double getCarroProprio() {
        return carroProprio;
    }

    public void setCarroProprio(float carroProprio) {
        this.carroProprio = carroProprio;
    }

    public double getCasaPropria() {
        return casaPropria;
    }

    public void setCasaPropria(float casaPropria) {
        this.casaPropria = casaPropria;
    }

    public String exibirInfosmedico() {
        return super.toString() + "\nValor dos Bens: " + "\nCasa = R$ " + casaPropria + "  |  Carro = R$ " + carroProprio +
        "\nTotal dos Bens = R$ " + calcularTotaldeBens();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

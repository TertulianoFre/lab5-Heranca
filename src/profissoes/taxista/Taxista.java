package profissoes.taxista;

import contribuinte.Contribuinte;

public class Taxista extends Contribuinte {
    private double numPassageiros, kmRodados;
    private double casaPropria, carroProprio;
    private double taxaImposto;

    public Taxista(String nome, String id, double numeroPassageirosAno, double kmRodadosAno, double casaPropria, double carroProprio){
        super(nome, id);
        this.numPassageiros = numeroPassageirosAno;
        this.kmRodados = kmRodadosAno;
        this.casaPropria = casaPropria;
        this.carroProprio = carroProprio;
    }

    public Taxista(String nome, String id, double numeroPassageirosAno, double kmRodadosAno){
        super(nome, id);
        this.numPassageiros = numeroPassageirosAno;
        this.kmRodados = kmRodadosAno;
        this.casaPropria = 0.0;
        this.carroProprio = 0.0;
    }

    public double calcularImpostoTaxista(){
        taxaImposto = (float) ((0.5 * numPassageiros) - (0.01 * kmRodados));
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

    public String exibirInfostaxista() {
        return super.toString() + "\nValor dos Bens: " + "\nCasa = R$ " + casaPropria + "  |  Carro = R$ " + carroProprio +
        "\nTotal dos Bens = R$ " + calcularTotaldeBens();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

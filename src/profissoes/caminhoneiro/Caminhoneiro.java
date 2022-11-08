package profissoes.caminhoneiro;

import contribuinte.Contribuinte;

public class Caminhoneiro extends Contribuinte{

    private double numToneladas, kmRodados;
    private double casaPropria, carroProprio;
    private double taxaImposto;

    public Caminhoneiro(String nome, String id, double numeroToneladasAno, double kmRodadosAno, double casaPropria, double carroProprio) {
        super(nome, id);
        this.numToneladas = numeroToneladasAno;
        this.kmRodados = kmRodadosAno;
        this.casaPropria = casaPropria;
        this.carroProprio = carroProprio;
    }
    public Caminhoneiro(String nome, String id, double numeroToneladasAno, double kmRodadosAno){
        super(nome, id);
        this.numToneladas = numeroToneladasAno;
        this.kmRodados = kmRodadosAno;
        this.casaPropria = 0.0;
        this.carroProprio = 0.0;
    }
    public double calcularImpostoCaminhoneiro(){
        if(numToneladas <= 10){
            taxaImposto = 500;
            return taxaImposto;
        }else{
            double toneladas = numToneladas - 10;
            return taxaImposto = ((toneladas * 100) + 500) - (0.01 * kmRodados);
        }
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
    public String exibirInfoscaminhoneiros() {
        return super.toString() + "\nValor dos Bens: " + "\nCasa = R$ " + casaPropria + "  |  Carro = R$ " + carroProprio +
        "\nTotal dos Bens = R$ " + calcularTotaldeBens();
    }

    @Override
    public String toString() {
        return super.toString();
    }


}

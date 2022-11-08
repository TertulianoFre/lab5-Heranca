package profissoes.professor;

import contribuinte.Contribuinte;

public class Professor extends Contribuinte{
    private double salario;
    private double casaPropria, carroProprio;
    private double taxaImposto;
    private double despesasMateriais;

    public Professor(String nome, String id, double casaPropria, double carroProprio, double despesasComMateriais, double salarioMes){
        super(nome, id);
        this.salario = salarioMes;
        this.despesasMateriais = despesasComMateriais;
        this.casaPropria = casaPropria;
        this.carroProprio = carroProprio;
    }
    public Professor(String nome, String id, double despesasComMateriais, double salarioMes){
        super(nome, id);
        this.salario = salarioMes;
        this.despesasMateriais = despesasComMateriais;
        this.casaPropria = 0.0;
        this.carroProprio = 0.0;
    }
    public double calcularImpostoProfessor(){
        if(salario <= 1212){
            taxaImposto = (salario * 0.05) - (despesasMateriais / 2);
            return taxaImposto;
        }else if(salario <= 6060){
            taxaImposto = (salario * 0.1) - (despesasMateriais / 2);
            return taxaImposto;
        }else{
            taxaImposto = (salario * 0.2) - (despesasMateriais / 2);
            return taxaImposto;
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

    public String exibirInfosprofessor() {
        return super.toString() + "\nValor dos Bens: " + "\nCasa = R$ " + casaPropria + "  |  Carro = R$ " + carroProprio +
        "\nTotal dos Bens = R$ " + calcularTotaldeBens();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

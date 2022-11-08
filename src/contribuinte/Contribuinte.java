package contribuinte;

public class Contribuinte {
    private String nome;
    private String id;

    public Contribuinte(String nome, String id){
        this.nome = nome;
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "\nNome: " + nome +"\nID: " + id;
    }
}

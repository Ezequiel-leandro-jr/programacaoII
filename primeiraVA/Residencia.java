public class Residencia {
    private String nome_residencia;
    private double preco_diaria;
    private String descricao;

    public Residencia(String nome_residencia, double preco_diaria, String descricao) {
        this.nome_residencia = nome_residencia;
        this.preco_diaria = preco_diaria;
        this.descricao = descricao;

    }

    @Override
    public String toString(){
        return "nome_residencia: " + this.nome_residencia + 
        "\npreco_diaria: " + this.preco_diaria;
    }
}
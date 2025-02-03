public class Pessoa {
    private String nome;
    private String nascimento;
    private double cpf;

    public Pessoa(String nome, String nascimento, double cpf) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNascimento() {
        return this.nascimento;
    }

    public double getCpf() {
        return this.cpf;
    }

    @Override
    public String toString(){
        return "nome: " + this.nome;
    }


}
public class Aluguel {
    private String pessoa;
    private String residencia;
    private String data_entrada;
    private double diarias;

    public Aluguel(String pessoa, String residencia, String data_entrada, double diarias) {
        this.pessoa = pessoa;
        this.residencia = residencia;
        this.data_entrada = data_entrada;
        this.diarias = diarias;
    }

    @Override
    public String toString(){
        return "pessoa: " + this.pessoa + 
        "\nresidencia: " + this.residencia +
        "\ndiarias: " + this.diarias;
    }
}
import java.util.Scanner;

public class LivroNotas {
    private int quantidade_notas;
    private double soma_notas;

    public LivroNotas() {
        this.quantidade_notas = 0;
        this.soma_notas = 0;
    }

    public void adicionarNotas() {
        Scanner input = new Scanner(System.in);
        double nota = 0;
        double soma = 0;
        int quantidade = 0;

        while (nota >= 0) {
            System.out.print("NOTA: ");
            nota = input.nextDouble();
            if (nota < 0) {
                break;
            }

            soma += nota;
            quantidade++;
        }

        setSomaNotas(soma);
        setQuantidadeNotas(quantidade);
    }

    public void calcularMedia() {
        if (quantidade_notas > 0) {
            double media = soma_notas / quantidade_notas;
            System.out.printf("MÉDIA: %.2f%n", media);
        } else {
            System.out.println("Não há notas para calcular a média.");
        }
    }

    public void mostrarQuantidadeNotas() {
        System.out.printf("QUANTIDADE DE NOTAS: %d%n", quantidade_notas);
    }

    public double getSomaNotas() {
        return this.soma_notas;
    }

    public int getQuantidadeNotas() {
        return this.quantidade_notas;
    }

    public void setSomaNotas(double soma_notas) {
        this.soma_notas = soma_notas;
    }

    public void setQuantidadeNotas(int quantidade_notas) {
        this.quantidade_notas = quantidade_notas;
    }
}

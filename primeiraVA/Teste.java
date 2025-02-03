public class Teste {
    public static void main(String[] args) {
        Pessoa pessoaA = new Pessoa("Ezequiel", "23/01/1992", 12345);
        Pessoa pessoaB = new Pessoa("Palloma", "11/05/1993", 67899);
        Pessoa pessoaC = new Pessoa("Cleide", "17/12/1964", 54321);

        Residencia res1 = new Residencia("Casa", 600, "Casa com dois quartos e dois banheiros.");
        Residencia res2 = new Residencia("Apartamento", 2500, "Apartamento com dois quartos e uma suíte.");
        Residencia res3 = new Residencia("Mansao", 8000, "Mansão com 5 quartos e 5 suítes.");

        Aluguel aluguel1 = new Aluguel("Ezequiel", "Casa", "03/02/2025", 30);
        Aluguel aluguel2 = new Aluguel("Palloma", "Apartamento", "03/02/2025", 60);
        Aluguel aluguel3 = new Aluguel("Cleide", "Mansao", "03/02/2025", 90);
        Aluguel aluguel4 = new Aluguel("Ezequiel", "Mansao", "12/10/2025", 120);

    }
}

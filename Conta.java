public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta(String numero){
        this.numero = numero;
        this.saldo = 0;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void creditar(double credito) {
        this.saldo += credito;
    }

    public void debitar(double debito) {
        if(this.saldo >= debito){
            this.debito -= debito;
        }
    }

    public String getNumero() {
        return this.numero;
    }
}
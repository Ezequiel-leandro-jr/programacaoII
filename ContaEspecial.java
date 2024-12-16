public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(String numero, double limite){
        super(numero);
        this.limite = limite;
    }

    public double getLimite(){
        return this.limite;
    }

    public void debitar(double debito){
        if(this.getSaldo() + this.getLimite() >= debito) {
            super.debitar(debito);
        }
    }
}
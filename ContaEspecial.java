public class ContaEspecial extends Conta{

    private double limite;

    public ContaEspecial(String numero, double limite){
        super(numero);
        this.limite = limite;
    }


    public boolean debitar (double valor){
        if ((this.getSaldo()+this.limite)>=valor){
            super.debitar2(valor);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return this.limite;
    } 

    @Override
    public String toString(){
        return "Número: " + this.getNumero() + "\nSaldo: " + this.getSaldo() + "\nLimite: " + this.getLimite();
    }




}
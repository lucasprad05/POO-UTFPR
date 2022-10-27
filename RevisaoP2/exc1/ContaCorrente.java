package exc1;


public class ContaCorrente extends Conta implements ICliente{
    private int numeroConta;
    public float saldo;
    
    public ContaCorrente(){
        
    }
    public ContaCorrente(int numeroConta, float saldo, float saque){
        this.numeroConta = numeroConta;
        this.saldo = saldo - saque;
    }
    
    public int getNumeroConta(){
        return this.numeroConta;
    }

    public String getCliente() {
        return ICliente.NOME;
    }

    public float getSaldo() {
        return this.saldo;
    }
    
    public String toString(){
        return "Numero conta: " + this.numeroConta + "\n Saldo: " + this.saldo;
    }
    
}

package exc1;

public class ContaSalario extends Conta implements ICliente{
    private float valor;
    public float saldo;
    public int cpf;
    
    public ContaSalario(){
        
    }
    public ContaSalario(float valor, float saldo, int cpf){
        this.valor = valor;
        this.saldo = saldo;
        this.cpf = cpf;
    }
    
    public float getValor(){
        return this.valor;
    }
    
    public String getCliente() {
        return ICliente.NOME;
    }

    public float getSaldo() {
       return this.saldo;
    }
    
    public String toString(){
        return "Valor: " + this.valor + "\n Saldo: " + this.saldo + "\n CPF: " + this.cpf;
    }
}

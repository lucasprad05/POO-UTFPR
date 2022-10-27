package exc1;

public class ContaPoupanca extends Conta implements ICliente{
    public float saldo;
    public String consulta;
    
    public ContaPoupanca(){
        
    }
    public ContaPoupanca(float saldo, String consulta){
        this.saldo = saldo;
        this.consulta = consulta;
    }
    
    
    public String getCliente() {
        return ICliente.NOME;
    }

    public float getSaldo() {
        return this.saldo;
    }
    
    public String toString(){
        return "Data da consulta: " + this.consulta + "\n Saldo: " + this.saldo;
    }
    
}

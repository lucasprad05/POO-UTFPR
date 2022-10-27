package exc2;

public class ValorNegativo extends Exception{
    public float valor;
    
    public ValorNegativo(float valor){
        super();
        this.valor = valor;
    }
    
    public String toString(){
        return "Erro valor negativo";
    }
}

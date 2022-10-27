package exc2;

public class Gotejador extends SistemaIrrigacao {
    
    public Gotejador(float valor) throws ValorNegativo{
        if (valor < 0){
            throw new ValorNegativo(valor);
        }
        else if (valor > 0){
            setValor(valor);
            getValor();
            System.out.println(valor);
        }
    }

    public float getValor() {
        return this.valor;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
}

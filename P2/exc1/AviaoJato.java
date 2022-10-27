package exc1;

public class AviaoJato extends Aviao implements IVoo {
    public float combustivel;
    public float carga;
    public float pesoTotal;
    public float pesoPouso;
    public String destino;
    
    public AviaoJato(){
        
    }
    
   public AviaoJato(float combustivel, float carga, String destino, int tempoMax){
       this.combustivel = combustivel;
       this.carga = carga;
       pesoTotal();
       pesoPouso();
       destino(destino);
       tempoMax(tempoMax);
   }
   
   public void pesoTotal(){
       pesoTotal = combustivel + carga;
   }
   
   public void pesoPouso(){
       pesoPouso = (float) (carga + (combustivel * 0.15));
   }

    public void destino(String destino) {
        this.destino = destino;
    }
   
    public String toString(){
        return "Aviao Jato: \n" + "Combustivel: " + this.combustivel + "\nCarga: " + this.carga + "\nDestino: " + this.destino + "\nAutonomia horas: " + this.tempoMax + "\n";
    }

    public void tempoMax(int tempoMax) {
        this.tempoMax = tempoMax;
    }
}

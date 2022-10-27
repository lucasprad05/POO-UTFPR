
package exc1;


public class AviaoPrivado extends Aviao implements IVoo {
    public String piloto;
    public String copiloto;
    public String destino;
    
    public AviaoPrivado(){
        
    }
    
    public AviaoPrivado(String piloto, String copiloto, String destino, int tempoMax){
        this.piloto = piloto;
        this.copiloto = copiloto;
        destino(destino);
        tempoMax(tempoMax);
    }
    
    public String tripulacao(){
        return "Crew: " + piloto + " " + copiloto + "\n";
    }

    public void destino(String destino) {
        this.destino = destino;
    }
    
    public String toString(){
        return "Aviao Privado: \n" + tripulacao() + "Destino: " + this.destino +  "\nAutonomia horas: " + this.tempoMax + "\n";
    }

    public void tempoMax(int tempoMax) {
        this.tempoMax = tempoMax;
    }
}

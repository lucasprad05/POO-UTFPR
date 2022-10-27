package exc1;


public class AviaoComercial extends Aviao implements IVoo {
    public int altitude;
    public int pax; //Pax eh sigla para passageiros na aviacao
    public int totalPessoas;
    public int altitudeDif;
    public String destino;
    
    public AviaoComercial(){
        
    }
    
    public AviaoComercial(int altitude, int pax, String destino, int tempoMax){
        this.altitude = altitude;
        this.pax = pax;
        destino(destino);
        totalPessoas();
        tempoMax(tempoMax);
    }
    
    public void totalPessoas(){
        totalPessoas = pax + 3;
    }
    
    public void altitudeIdeal(){
        altitudeDif = 43000 - altitude; //Diferenca q ainda pode subir
    }
    
    public void destino(String destino){
        this.destino = destino;
    }
    
    public String toString(){
        return "Aviao Comercial: \n" + "Pessoas: " + this.totalPessoas + "\nDestino: " + this.destino + "\n" + "Autonomia horas: " + this.tempoMax + "\n";
    }

    public void tempoMax(int tempoMax) {
        this.tempoMax = tempoMax;
    }
}


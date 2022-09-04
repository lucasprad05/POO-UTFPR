//Lucas Prado & Erik Noda
package exc4;

public class Veiculo {
    public String tipo;
    public String placa;
    public String horaSaida;
    public String horaEntrada;
    
    //Hora separada para calculo do gasto
    public int horaE;
    public int horaS;
    public int minE;
    public int minS;
    public int totalMinutos;
    
    //opcao estudante
    public int opcao;
      
    public Veiculo(String tipo, String placa, String horaSaida, String horaEntrada){
        cadastrar(tipo, placa, horaSaida, horaEntrada);
        tempo(horaSaida, horaEntrada);
     }

    public void cadastrar(String tipo, String placa, String horaSaida, String horaEntrada){
        this.tipo = tipo;
        this.placa = placa;
        this.horaSaida = horaSaida;
        this.horaEntrada = horaEntrada;
    }
     
    public void tempo(String horaSaida, String horaEntrada){
        String[] horaEnt = horaEntrada.split(":");
        horaE = Integer.parseInt(horaEnt[0]);
        minE = Integer.parseInt(horaEnt[1]);
        
        String[] horaSad = horaSaida.split(":");
        horaS = Integer.parseInt(horaSad[0]);
        minS = Integer.parseInt(horaSad[1]);
        
        totalMinutos = ((horaS * 60) + minS) - ((horaE * 60) + minE);
        
        Aluno entrada = new Aluno(totalMinutos);
        
    }
     
    public static void main( String [ ] args ){
        new Veiculo("Ferrari", "BDE178", "17:50", "14:40");
    } 

}//class

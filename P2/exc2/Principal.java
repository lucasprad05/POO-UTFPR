package exc2;


public class Principal{
    public void iniciar(){
        try{
        SistemaIrrigacao gotejador = new Gotejador(2f);
        }catch(ValorNegativo e){
            System.out.println(e);
        }catch(Exception ex){
            System.out.println("valor tem que ser um float");
        }
    }

   
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
    
}

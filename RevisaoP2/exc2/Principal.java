package exc2;

public class Principal {
    
    public void iniciar(){
        try{
            SistemaAcademico estudante = new POO(12f);
            System.out.println(estudante);
        }catch(ArithmeticException e){
            System.out.println("Erro Nota invalida");
        }
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
    
}

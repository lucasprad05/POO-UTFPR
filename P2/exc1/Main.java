package exc1;

import java.util.ArrayList;


public class Main {
    
    public void iniciar(){
        ArrayList<IVoo> lista = new ArrayList<>();
        IVoo voo = new AviaoComercial(38000, 256, "Paris", 13);
        lista.add(voo);
        
        voo = new AviaoPrivado("Joao", "Mazzaropi", "Curitiba", 3);
        lista.add(voo);
        
        voo = new AviaoJato(15f, 13f, "Tokyo", 8);
        lista.add(voo);
        
        for(IVoo i:lista){
            System.out.println(i);
        }
    }

    
    public static void main(String[] args) {
        Main main = new Main();
        main.iniciar();
    }
    
}
